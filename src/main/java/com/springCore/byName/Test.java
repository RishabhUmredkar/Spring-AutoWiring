package com.springCore.byName;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("com/springCore/byName/config.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Employee Que = (Employee) factory.getBean("Emp");
		System.out.println(Que);
	}

}
