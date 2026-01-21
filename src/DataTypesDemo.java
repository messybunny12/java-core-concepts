public class DataTypesDemo {

    // Instance variables (get default values)
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;

    public static void main(String[] args) {

        System.out.println("===== PRIMITIVE DATA TYPES DEMO =====");

        // 1. byte
        byte b = 100;
        System.out.println("byte value: " + b);

        // 2. short
        short s = 32000;
        System.out.println("short value: " + s);

        // 3. int
        int i = 100000;
        System.out.println("int value: " + i);

        // 4. long (L is mandatory)
        long l = 10000000000L;
        System.out.println("long value: " + l);

        // 5. float (f is mandatory)
        float f = 10.5f;
        System.out.println("float value: " + f);

        // 6. double
        double d = 99.99;
        System.out.println("double value: " + d);

        // 7. char
        char c1 = 'A';
        char c2 = 65; // ASCII value
        System.out.println("char value 1: " + c1);
        System.out.println("char value 2 (ASCII 65): " + c2);

        // 8. boolean
        boolean flag = true;
        System.out.println("boolean value: " + flag);

        // Calling method to show default values
        DataTypesDemo demo = new DataTypesDemo();
        demo.showDefaultValues();
    }

    void showDefaultValues() {
        System.out.println("\n===== DEFAULT VALUES OF INSTANCE VARIABLES =====");
        System.out.println("byte default: " + byteVar);
        System.out.println("short default: " + shortVar);
        System.out.println("int default: " + intVar);
        System.out.println("long default: " + longVar);
        System.out.println("float default: " + floatVar);
        System.out.println("double default: " + doubleVar);
        System.out.println("char default: [" + charVar + "]");
        System.out.println("boolean default: " + booleanVar);
    }
}
