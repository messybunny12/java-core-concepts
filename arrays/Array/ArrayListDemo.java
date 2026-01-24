import java.util.ArrayList;

/**
 * Demonstrates dynamic array behavior using ArrayList.
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        System.out.println("Size: " + list.size());
    }
}
