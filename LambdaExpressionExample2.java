package lambdaExpression;

interface Sayable{  
    public String say();  
}  
public class LambdaExpressionExample2{  
public static void main(String[] args) {  
    Sayable s=()->{  
        return "I have nothing to tell.";  
    };  
    System.out.println(s.say());  
}  
}  
