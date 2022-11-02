package chapter10;

class NumberPrinter {
    private int myNum = 0;
    private static int staticMyNum = 0;
    
    //static 함수에 인스턴스 라면(변수,함수)가 올수 없는 이유?
    //메모리 생성 시기가 다르기 때문에 ..
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