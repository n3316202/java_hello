package chapter5;

class CondOp {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 100;
        
        int big;
        int diff;
        
        big = (num1 > num2) ? num1 : num2;
        System.out.println("ū��" + big);
        
        //num1 num2 �� ������ ���밪�� ���ϴ� ���α׷�¥�ÿ�
        
        
        big = (num1 > num2) ? (num1-num2) : (num2 - num1);
        
        if((num1 - num2) > 0) {
        	System.out.println("ū��" + (num1 - num2));
        }else {
        	System.out.println("ū��" + -(num1 - num2));
        }
        
        
        
    }
}