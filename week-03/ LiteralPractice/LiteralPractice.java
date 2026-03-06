public class  LiteralPractice {
    public static void main(String [] args) {
        
        //Long literal (required 'L' suffix)
        long population = 900000000L;
        
        //Float literal (requires 'f' suffix)
        float price = 19.75f;
        
        //Char literal using unicode escape sequence(symbol)
        char copyrightSymbol = '\u00A9';
        
        //printing the values
        System.out.println("Long value:  " + population);
        System.out.println("Float value:  " + price);
        System.out.println("Char value (Unicode):  " + copyrightSymbol);
    }
}