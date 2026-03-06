public class DefaultValues {
    //member variables of all 8 primitive types
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;
    
    public static void main(String [] args) {
         
        //creating an object of the class
        DefaultValues obj = new DefaultValues();
         //priting default values
         
         System.out.println("Byte defult value: " + obj.byteValue);
         System.out.println("Short defult value: " + obj.shortValue);
         System.out.println("Int defult value: " + obj.intValue);
         System.out.println("Long defult value: " + obj.longValue);
         System.out.println("Float defult value: " + obj.floatValue);
         System.out.println("Double defult value: " + obj.doubleValue);
         System.out.println("Char defult value: " + obj.charValue);
         System.out.println("Boolean defult value: " + obj.booleanValue);
         
    }
}