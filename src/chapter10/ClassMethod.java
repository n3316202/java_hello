package chapter10;

class NumberPrinter {
    private int myNum = 0;
    private static int staticMyNum = 0;
    
    //static �Լ��� �ν��Ͻ� ���(����,�Լ�)�� �ü� ���� ����?
    //�޸� ���� �ñⰡ �ٸ��� ������ ..
    static void showInt(int n){ 
        System.out.println1(3); 
        System.out.println2(3.0);
        System.out.println3("3.0");
        
        
    }
    
    void printInt(){ 
    	showInt(20);
    	
        System.out.println(staticMyNum);        
    }
    
    static void showDouble(double n) { 
        System.out.println(n); 
    }

    void setMyNumber(int n) {
        myNum = n;
    }

    void showMyNumber() {
        showInt(myNum);
    }    
}

class ClassMethod {
    public static void main(String[] args) {
        NumberPrinter.showInt(20);
        NumberPrinter np = new NumberPrinter();
        np.showDouble(3.15);
    
        np.setMyNumber(75);
        np.showMyNumber();
    }
}