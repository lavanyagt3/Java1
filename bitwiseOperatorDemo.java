package BasicsOfJava;

public class bitwiseOperatorDemo {
	public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        // Bitwise AND
        System.out.println("a & b: " + (a & b));  
        
        // Bitwise OR
        System.out.println("a | b: " + (a | b));  


        System.out.println("a ^ b: " + (a ^ b));  

        // Bitwise NOT
        System.out.println("~a: " + (~a)); 

        // Left shift
        System.out.println("a << 2: " + (a << 2)); 
   
       
        
        // Right shift
        System.out.println("a >> 2: " + (a >> 2)); 
        
    }

}
