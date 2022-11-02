package chapter6;

class LocalVariable {
	
	int abc = 3;
	
	public void aaa() {
		System.out.println(abc);
	}
	
    public static void main(String[] args) {
        boolean ste = true;
        int num1 = 11;

         
        if(ste) {
          //int num1 = 22;
            num1++;
            System.out.println(num1);
        }   

        {
            int num2 = 33;
            num2++;
            System.out.println(num2);
        }
        
      System.out.println(num2);
    }
}
