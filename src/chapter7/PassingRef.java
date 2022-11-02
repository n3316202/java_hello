package chapter7;

class BankAccount {
    int balance = 0;     // ���� �ܾ�

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }    

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("�ܾ� : " + balance);
        return balance;
    }
}
	

class PassingRef {
    public static void main(String[] args) {
        BankAccount ref = new BankAccount();

        //ref = null; //�������� ����
        
        //int num = null;
        
        ref.deposit(3000);
        ref.withdraw(300);

        check(ref);
        
        ref.checkMyBalance(); //2400
        
        
    }
        
    public static void check(BankAccount acc) {
	    if(acc != null) {
	    	acc.withdraw(300);
	        acc.checkMyBalance(); //2700 // 2400
    	}
    }
}