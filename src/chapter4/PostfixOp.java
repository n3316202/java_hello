package chapter4;

class PostfixOp {
    public static void main(String[] args) {
    	int kor = 50;
    	int eng = 45;
    	int math = 45;
    	int total;
    	double avg;
    	
    	total = kor + eng + math;
    	avg = total / 3.0;
    	
    	if(avg >= 90 ) {
    		System.out.println("�� �Դϴ�.");
    	}else if(avg >= 80) {
    		System.out.println("�� �Դϴ�.");
    	}else if(avg >= 70) {
    		System.out.println("�� �Դϴ�.");
    	}else if(avg >= 60) {
    		System.out.println("�� �Դϴ�.");
    	}else{
    		System.out.println("�� �Դϴ�.");
    	}
    	
    	
    	if(avg >= 90) {
    		System.out.println("�� �Դϴ�.");
    	}else if(avg >= 80) {
    		System.out.println("�� �Դϴ�.");
    	}else if(avg >= 70) {
    		System.out.println("�� �Դϴ�.");
    	}else if(avg >= 60) {
    		System.out.println("�� �Դϴ�.");
    	}else{
    		System.out.println("�� �Դϴ�.");
    	}
    	
    	
    	
    	
    }
}