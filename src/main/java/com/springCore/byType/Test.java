package com.springCore.byType;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {
	public static void main(String[] args) 
	{
		Resource r = new ClassPathResource("com/springCore/byType/config.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Employee  Employee= (Employee) factory.getBean("Employee");
		System.out.println(Employee);
	}
}