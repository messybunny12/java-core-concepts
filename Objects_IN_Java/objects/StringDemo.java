import java.util.Arrays;

/**
 * Demonstrates String creation, immutability,
 * comparison, and common String operations.
 */
public class StringDemo {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = "  Java Programming";

        // String comparison
        System.out.println(s1 == s2);       // true (same reference in pool)
        System.out.println(s1 == s3);       // false (heap vs pool)
        System.out.println(s1.equals(s3));  // true (content comparison)

        System.out.println("\nPrinting String built-in methods:");

        System.out.println("Length: " + s4.length());
        System.out.println("CharAt(2): " + s4.charAt(2));
        System.out.println("Lowercase: " + s4.toLowerCase());
        System.out.println("Uppercase: " + s4.toUpperCase());
        System.out.println("Substring: " + s4.substring(0, 4));
        System.out.println("Trimmed: '" + s4.trim() + "'");
        System.out.println("Contains 'Java': " + s4.contains("Java"));
        System.out.println("Replace: " + s4.replace("Java", "C++"));

        // split() returns an array
        String[] words = s4.trim().split(" ");
        System.out.println("Split: " + Arrays.toString(words));

        // Immutability demonstration
        String s = "Hello";
        s = s.concat(" World");
        System.out.println("After concat: " + s);
    }
}
