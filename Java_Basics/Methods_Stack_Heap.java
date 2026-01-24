public class Methods_Stack_Heap {

    static void first() {
        System.out.println("First method");
        second();
    }

    static void second() {
        System.out.println("Second method");
    }

    public static void main(String[] args) {
        first();
    }
}
