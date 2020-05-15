
public class Hello {

	public static void main(String[] args) {
		
		int n1 = 10000;
		int n2 = 2000;
		int n3 = 300;
		
		int max=0;	
		
		if(n1>n2){
			
			if(n1>n3){
				max = n1;
			}else{
				max = n3;
			}
			
		}else{
			
			if(n2>n3){
				max = n2;
			}else{
				max = n3;
			}			
		}
		
		System.out.println("최대값은 " +  max);
	}

}
