package com.jee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("myspringconf.xml"));
		 Triangle t = (Triangle) factory.getBean("triangleid");
		 t.draw();

	}

}
