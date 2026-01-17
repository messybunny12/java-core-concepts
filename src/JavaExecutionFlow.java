public class JavaExecutionFlow {

    /*
     * Program Name: JavaExecutionFlow
     *
     * Purpose:
     * This program demonstrates:
     * - Basic Java program structure
     * - Entry point of Java (main method)
     * - How Java code execution starts from main()
     *
     * Execution Flow:
     * 1. Java source code (.java) is compiled to bytecode (.class)
     * 2. JVM loads the class using ClassLoader
     * 3. main() method execution begins
     */

    public static void main(String[] args) {

        System.out.println("Java Execution Started");

        JavaExecutionFlow obj = new JavaExecutionFlow();

        obj.printMessage();

        System.out.println("Java Execution Ended");
    }

    private  void printMessage() {
        System.out.println("Inside a method call - Stack memory in action");
    }
}
