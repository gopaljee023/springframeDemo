package com.jee;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	 private Point pointCenter;

	@Override
	public void draw() {
		System.out.println("center is "+pointCenter.toString());
	}

	public Point getPointCenter() {
		return pointCenter;
	}

	@Required
	public void setPointCenter(Point pointCenter) {
		this.pointCenter = pointCenter;
	}
	
	 
}
