import java.util.Scanner;

class Student {
    private String name ;
    private int id;
    private int marks;
    public Student(String name, int id, int marks)
    {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    public char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else if (marks >= 50) return 'E';
        else return 'F';
    }
    public  void displayDetails()
    {
        System.out.println("------------------------------------------------------------------");
        System.out.println("These are the details of the student:");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Student name is "+name);
        System.out.println("Student Id is "+id);
        System.out.println("Student marks is "+marks);
        System.out.println("Student Grade: " + calculateGrade());
    }
}
public class StudentManagement {
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Management System");
        System.out.println("----------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        System.out.print("Enter Student Id: ");
        int id = input.nextInt();
        System.out.print("Enter Student Marks: ");
        int marks = input.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered");
            return;
        }
        Student student = new Student(name,id,marks);
        student.displayDetails();
    }
}