package chapter5;

class SwitchBasic {
    public static void main(String[] args) {
        
    	//¾óÂ¯ ¹ÂÁö¼Ç
    	//2. °É¾î¼­ ÇÏ´Ã±îÁö() - °É¸®¸é break ±îÁö
    	int n = 65;
    	
        switch(n) {
        case 'A':
            System.out.println("Simple Java");
            
        case 2:
            System.out.println("Funny Java");
            break;
        case 3:
            System.out.println("Fantastic Java");
        default:
            System.out.println("The best programming language");
        }
        
        String str="ABC";
        
        switch (str) {
		case "º½":
			System.out.println("Do you like Java?");
			break;

		default:
			break;
		}
        
        
        System.out.println("Do you like Java?");
    }
}