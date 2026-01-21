public class OperatorsDemo {

    public static void main(String[] args) {

        System.out.println("===== OPERATORS DEMO =====");

        // 1. Arithmetic Operators
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division (int): " + (a / b));     // integer division
        System.out.println("Modulus: " + (a % b));

        // 2. Relational Operators
        System.out.println("\n===== RELATIONAL OPERATORS =====");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // 3. Logical Operators
        System.out.println("\n===== LOGICAL OPERATORS =====");
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // 4. Short-Circuit Operators
        System.out.println("\n===== SHORT CIRCUIT =====");
        int m = 5;
        int n = 10;

        if (m > 10 && ++n > 10) {
            System.out.println("Inside if");
        }
        System.out.println("n after && : " + n); // n not incremented

        if (m < 10 || ++n > 10) {
            System.out.println("Inside if");
        }
        System.out.println("n after || : " + n); // n not incremented again

        // 5. Assignment Operators
        System.out.println("\n===== ASSIGNMENT OPERATORS =====");
        int p = 10;
        p += 5;
        p -= 3;
        p *= 2;
        p /= 4;
        System.out.println("Final value of p: " + p);

        // 6. Unary Operators (Pre/Post Increment)
        System.out.println("\n===== UNARY OPERATORS =====");
        int u = 5;
        System.out.println("Post-increment u++: " + (u++));
        System.out.println("After post-increment: " + u);
        System.out.println("Pre-increment ++u: " + (++u));

        // 7. Ternary Operator
        System.out.println("\n===== TERNARY OPERATOR =====");
        int max = (a > b) ? a : b;
        System.out.println("Max value: " + max);

        // 8. Bitwise Operators (Basic)
        System.out.println("\n===== BITWISE OPERATORS =====");
        int bit1 = 5;   // 0101
        int bit2 = 3;   // 0011

        System.out.println("AND (&): " + (bit1 & bit2));
        System.out.println("OR (|): " + (bit1 | bit2));
        System.out.println("XOR (^): " + (bit1 ^ bit2));
        System.out.println("Left Shift (<<): " + (bit1 << 1));
        System.out.println("Right Shift (>>): " + (bit1 >> 1));
    }
}
