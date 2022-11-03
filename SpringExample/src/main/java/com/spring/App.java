package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.entity.Student;

@SuppressWarnings("deprecation")
public class App 
{
    public static void main( String[] args )
    {
    	//IOC - BeanFactory & ApplicationContext
    	
    	Resource res = new ClassPathResource("ApplicationContext.xml");
    	BeanFactory bean = new XmlBeanFactory(res);
    	
//    	ClassPathResource c = new ClassPathResource("ApplicationContext.xml");
    	
    	Student s = (Student) bean.getBean("st");
    	s.display();
    	
    	Student s1 = (Student) bean.getBean("st1");
    	s1.display();
    }
}