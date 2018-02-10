package com.htc.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.htc.batch.model.Person;

public class PersonItenProcessor implements ItemProcessor<Person,Person>{

	@Override
	public Person process(Person person) throws Exception {
		return person;
	}

	
}
