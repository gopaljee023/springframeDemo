package com.jee;

public class Triangle {

	String type;
	private int height;
	
	public Triangle(String type) {
		this.type = type;
	}
	
	
	public Triangle(int height) {
		this.height = height;
		System.out.println("not called");
	}
	
	
	public Triangle(String type,int height) {
		this.type = type;
		this.height =height;
	}
	public String getType() {
		return type;
	}
	
	public void draw() {
		System.out.println(type.toString()+" Triangle draw with height "+ height);
	}
}
