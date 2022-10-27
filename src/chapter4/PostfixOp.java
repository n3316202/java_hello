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
    		System.out.println("수 입니다.");
    	}else if(avg >= 80) {
    		System.out.println("우 입니다.");
    	}else if(avg >= 70) {
    		System.out.println("미 입니다.");
    	}else if(avg >= 60) {
    		System.out.println("양 입니다.");
    	}else{
    		System.out.println("가 입니다.");
    	}
    	
    	
    	if(avg >= 90) {
    		System.out.println("수 입니다.");
    	}else if(avg >= 80) {
    		System.out.println("우 입니다.");
    	}else if(avg >= 70) {
    		System.out.println("미 입니다.");
    	}else if(avg >= 60) {
    		System.out.println("양 입니다.");
    	}else{
    		System.out.println("가 입니다.");
    	}
    	
    	
    	
    	
    }
}