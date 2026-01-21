public class TypeCastingDemo {

    public static void main(String[] args) {

        System.out.println("===== TYPE CASTING DEMO =====");

        // 1. Widening (Implicit Casting) - Small to Large
        int intVal = 100;
        double doubleVal = intVal; // int -> double
        System.out.println("Widening: int to double = " + doubleVal);

        // 2. Narrowing (Explicit Casting) - Large to Small
        double price = 99.99;
        int roundedPrice = (int) price; // decimal lost
        System.out.println("Narrowing: double to int = " + roundedPrice);

        // 3. Byte Overflow Example
        byte b = 127;
        b++; // overflow
        System.out.println("Byte overflow (127 + 1): " + b);

        // 4. Char to Int and Int to Char
        char ch = 'A';
        int ascii = ch;
        System.out.println("Char to int (A): " + ascii);

        int value = 66;
        char convertedChar = (char) value;
        System.out.println("Int to char (66): " + convertedChar);

        // 5. Casting in Expressions (Important Interview Trap)
        int a = 10;
        int c = 3;
        double result = a / c;
        System.out.println("Without casting (10/3): " + result);

        double correctResult = (double) a / c;
        System.out.println("With casting ((double)10/3): " + correctResult);

        // 6. Float and Double Casting
        float f = 10.5f;
        int intFromFloat = (int) f;
        System.out.println("Float to int: " + intFromFloat);

        // 7. Short & Byte Promotion in Arithmetic
        byte x = 10;
        byte y = 20;
        int sum = x + y; // byte + byte -> int
        System.out.println("Byte addition result stored in int: " + sum);
    }
}
