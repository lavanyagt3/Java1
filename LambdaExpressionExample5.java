package lambdaExpression;

import java.util.*;  
public class LambdaExpressionExample5{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Anusha");  
        list.add("Lavanya");  
        list.add("sara");  
        list.add("zara");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  