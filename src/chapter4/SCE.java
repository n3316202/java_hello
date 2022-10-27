package chapter4;

class SCE {
    public static void main(String[] args) {
        
    	int num1 = 1; 
        int num2 = 0;
        boolean result;
        
        num1 = -1 * num1;
        
        System.out.println(num1);
        
        result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2 + '\n');
		
        result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}