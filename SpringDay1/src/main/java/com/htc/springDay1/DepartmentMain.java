package com.htc.springDay1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DepartmentMain {
public static void main(String[] args) {
	//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("bean.xml"));
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	Department d=(Department)context.getBean("dept");
	d.displayinfo();
}
}
