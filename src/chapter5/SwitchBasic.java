package chapter5;

class SwitchBasic {
    public static void main(String[] args) {
        
    	//��¯ ������
    	//2. �ɾ �ϴñ���() - �ɸ��� break ����
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
		case "��":
			System.out.println("Do you like Java?");
			break;

		default:
			break;
		}
        
        
        System.out.println("Do you like Java?");
    }
}