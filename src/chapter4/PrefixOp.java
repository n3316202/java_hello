package chapter4;

class PrefixOp {
    public static void main(String[] args) {
        int num = 7;       
        
        //System.out.println(++num);
        
        //System.out.println(++num); //7 8
        //System.out.println(++num);
        
       // System.out.println(num);	
        
        System.out.println(num++); //7 8
        System.out.println(num++);
        
        System.out.println(num);
    }
}