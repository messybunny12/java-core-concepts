/**
 * Demonstrates different types of variables in Java:
 * 1. Instance variable  - belongs to an object of the class
 * 2. Static variable    - belongs to the class and is shared across all objects
 * 3. Local variable     - declared inside a method and accessible only within that method
 *
 * This example helps understand variable scope, lifetime, and memory allocation.
 */
public class VariablesDemo {

    // Instance variable (stored in heap, each object gets its own copy)
    int instanceVar = 10;

    // Static variable (stored in method area, shared across all objects)
    static int staticVar = 20;

    public static void main(String[] args) {

        // Local variable (stored in stack, accessible only within this method)
        int localVar = 30;
        VariablesDemo vd = new VariablesDemo();
        System.out.println("Instance variable = "+vd.instanceVar);
        System.out.println("Static variable = "+staticVar);
        System.out.println("Local variable = "+localVar);
    }
}
