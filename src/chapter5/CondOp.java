package chapter5;

class CondOp {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 100;
        
        int big;
        int diff;
        
        big = (num1 > num2) ? num1 : num2;
        System.out.println("큰수" + big);
        
        //num1 num2 의 차이의 절대값을 구하는 프로그램짜시오
        
        
        big = (num1 > num2) ? (num1-num2) : (num2 - num1);
        
        if((num1 - num2) > 0) {
        	System.out.println("큰수" + (num1 - num2));
        }else {
        	System.out.println("큰수" + -(num1 - num2));
        }
        
        
        
    }
}