public class MathOperations {
    public static void main(String [] args) {
        int a = 10;
        int b = 5;
        
        //arithmetic operators
        
        System.out.println("Arithmetic Operations:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        
        //unary operators
        
        int x = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("Pre-increment:" + (++x));
        System.out.println("Post-increment:" + (x++));
        System.out.println("value after post-increment: " + x);
        
        //assignment operators
        
        int y = 20;
        System.out.println("\nAssignment Operators:");
        y += 5;
        System.out.println("y += 5: " + y);
        
        y-= 3;
        System.out.println("y -=3: " + y);
         
        y *= 2;
        System.out.println("y *= 2: " + y);
        
        y /= 2;
        System.out.println("y /= 2: " + y);
        
        //relational operation
        
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        
        //logical operators
        
        boolean condition1 = true;
        boolean condition2 = false;
        
        System.out.println("\nLogical Operators:");
        System.out.println("condition1 && condition2: " + (condition1 && condition2));
        System.out.println("condition1 || condition2: " + (condition1 || condition2));
        System.out.println("!condition1: " + (!condition1));
        
        //ternary operator
        
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Maximum number is: " + max);
        
        
        
    }
}