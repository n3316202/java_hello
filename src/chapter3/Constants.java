package chapter3;

//final = 활용

//카드 게임 , 고스톱

class Constants {
    public static void main(String[] args) {
        
    	///반지름이 10인 원의 넓이를 구하는 프로그램을 짜시오.
    	final long WIDTH = 120000000000L; 
    	final int HEIGH = 180;
    	
    	double radius = 10.0;
    	
    	
    	
    	System.out.println(Math.PI * radius * radius);
    	
    	
		/*
		 * //초기화의 의미
		 * 
		 * final int MAX_SIZE = 100; final char CONST_CHAR = '상'; final int
		 * CONST_ASSIGNED;
		 * 
		 * //MAX_SIZE = 20;
		 * 
		 * CONST_ASSIGNED = 12;
		 * 
		 * System.out.println("상수1 : " + MAX_SIZE); System.out.println("상수2 : " +
		 * CONST_CHAR); System.out.println("상수3 : " + CONST_ASSIGNED);
		 */
    }
}
