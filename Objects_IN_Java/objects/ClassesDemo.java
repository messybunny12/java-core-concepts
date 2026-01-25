import java.util.Scanner;

class Student{
    String name;
    int rollNumber;
    public void setDetails(String n, int r)
    {
        name=n;
        rollNumber=r;
    }
    public void displayDetails()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNumber);
    }
}

public class ClassesDemo {
    public static void main(String[] args) {
    
        // Create a Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name");
        String name = sc.nextLine(); // Read the name as a string input
        System.out.println("Enter Student Roll Number");
        int rollNumber = sc.nextInt(); // Read the roll number as an integer input

        // Create an object of the Student class
        Student student = new Student();

        // Set the details of the student using the setDetails() method
        student.setDetails(name, rollNumber);

        // Display the student's details using the displayDetails() method
        student.displayDetails();

        // Close the Scanner to free resources
        sc.close();
    }
}
