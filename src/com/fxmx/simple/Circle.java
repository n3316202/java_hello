package com.fxmx.simple;

//default
 class Circle {
	public double rad;
    final double PI;
    	
     Circle(double r) {
        rad = r;
        PI = 3.14;
    }
    
    // ���� �ѷ� ���� ��ȯ
     double getPerimeter() {
        return (rad * 2) * PI;
    }
}