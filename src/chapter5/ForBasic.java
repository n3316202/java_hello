package chapter5;

class ForBasic {

	public static void main(String[] args) {

		starPrint(3);
		starPrint(7);

		System.out.println( grade(avg(50,65,65)) );
		System.out.println(getHap(100)); 
		getHapPrint(10);
		getHapPrint(20);
	}
	
	public static void getHapPrint(int num) {
		
		int sum = 0;
		
		for(int i=1; i <= num ;i++) {
			
			if( i != num )
				System.out.print(i + "+");
			else
				System.out.print(i + "=");
			
			sum +=  i;		
		}
		
		System.out.println(sum);
		
	}
	
	
	//1+2+3+4+5+6+7+8+9+10 = 55
	
	public static int getHap(int num) {
		int sum = 0;
		
		for(int i=1;i <=num ;i++) {
			sum = sum+ i;
		}		
		return sum;		
	}
	
	public static char grade(double avg) {
		char ch = ' ';
		
		if(avg >= 90)
			ch = '수';
		else if(avg >= 80)
			ch = '우';
		else if(avg >= 70)
			ch = '미';
		else if(avg >= 60)
			ch = '양';
		else 
			ch = '가';
		
		return ch; 
	}
	
	public static double avg(int kor, int eng , int math) {
		return (kor + eng + math) / 3.0;
	}
	
	//수
	
	public static void starPrint(int num) {
		for (int i = 1; i <= num; i++) {
			// 54321
			/*
			 * for(int j=5; j>i; j--) { System.out.print(" "); //}
			 */
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}
	}


}