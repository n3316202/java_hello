package com.fxmx.simple;

//default
 class Circle {
	public double rad;
    final double PI;
    	
     Circle(double r) {
        rad = r;
        PI = 3.14;
    }
    
    // 원의 둘레 길이 반환
     double getPerimeter() {
        return (rad * 2) * PI;
    }
}