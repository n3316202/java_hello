package chapter4;

class LogicalOp {
    public static void main(String[] args) {
       
    	int num1 = 11;
        int num2 = 22;
        int num3 = 77;
        boolean result;

        result = (1 < num1) && (num1 < 100);
        System.out.println("1 �ʰ� 100 �̸��ΰ�? " + result);

        result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
        System.out.println("2 �Ǵ� 3�� ����ΰ�? " + result);

        result = !(num1 != 0);
        System.out.println("0 �ΰ�? " + result);
        
        result = flase && ((num3 % 7) == 0) && ((num3 % 11) == 0);
        System.out.println("0 �ΰ�? " + result);
    }
}