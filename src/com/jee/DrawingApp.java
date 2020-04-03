package com.jee;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("myspringconf.xml");
		 Triangle t = (Triangle) context.getBean("triangleid");
		 t.draw();
		 
		 Rivers rivers = (Rivers)context.getBean("river");
		 rivers.display();

	}

}
