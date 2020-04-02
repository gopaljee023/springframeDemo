package com.jee;

import java.util.Iterator;
import java.util.List;

public class Triangle {

	 private List<Point> points;
	

	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}


	public void draw() {
		for (Iterator iterator = points.iterator(); iterator.hasNext();) {
			Point point = (Point) iterator.next();
			System.out.println("("+point.toString() +")");
			
		}
		
		
		
	}
}
