package com.htc.batch.config;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.flash;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.xml.StaxEventItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.xstream.XStreamMarshaller;

import com.htc.batch.listener.JobCompletionNotificationListener;
import com.htc.batch.model.Person;
import com.htc.batch.processor.PersonItemProcessor;
import com.htc.batch.processor.PersonItenProcessor;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public DataSource dataSource;

    @Bean
    public FlatFileItemReader<Person> reader() {
        FlatFileItemReader<Person> reader = new FlatFileItemReader<Person>();
        reader.setResource(new ClassPathResource("persons.csv"));
        reader.setLineMapper(new DefaultLineMapper<Person>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(new String[] { "firstName", "lastName","email","age" });
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<Person>() {{
                setTargetType(Person.class);
            }});
        }});
        return reader;
    }

    @Bean
    public PersonItemProcessor processor() {
        return new PersonItemProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<Person> writer() {
        JdbcBatchItemWriter<Person> writer = new JdbcBatchItemWriter<Person>();
        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Person>());
        writer.setSql("INSERT INTO person (first_name, last_name,email,age) VALUES (:firstName, :lastName,:email,:age)");
        writer.setDataSource(dataSource);
        return writer;
    }
    
    
    @Bean
	public JdbcCursorItemReader<Person> readerDB(){
		JdbcCursorItemReader<Person> cursorItemReader = new JdbcCursorItemReader<Person>();
		
cursorItemReader.setDataSource(dataSource);
		cursorItemReader.setSql("SELECT person_id,first_name,last_name,email,age FROM person");
		cursorItemReader.setRowMapper(new PersonRowMapper());
		return cursorItemReader;
	}
	
	


@Bean
	public PersonItenProcessor processorDB(){
		return new PersonItenProcessor();
	}
	
	




@Bean(destroyMethod="")
	public StaxEventItemWriter<Person> writerXML(){
		StaxEventItemWriter<Person> writer1 = new StaxEventItemWriter<Person>();
		writer1.setResource(new ClassPathResource("persons.xml"));
		
		Map<String,String> aliasesMap =new HashMap<String,String>();
		aliasesMap.put("person", "com.htc.batch.model.Person");
		XStreamMarshaller marshaller = new XStreamMarshaller();
		marshaller.setAliases(aliasesMap);
		writer1.setMarshaller(marshaller);
		writer1.setRootTagName("persons");
		writer1.setOverwriteOutput(true);
		return writer1;
	}


    
    
    
    

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .start(step1()).next(step2())
                
               
                .build();
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<Person, Person> chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }
    
    
    
    @Bean
    public Step step2() {
        return stepBuilderFactory.get("step2")
                .<Person, Person> chunk(10)
                .reader(readerDB())
                .processor(processorDB())
                .writer(writerXML())
                .build();
    }
    
    
    
    
    
    
    
    
}






