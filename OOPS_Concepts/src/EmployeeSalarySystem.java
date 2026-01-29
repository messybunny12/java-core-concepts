import java.util.Scanner;
class Employee {
    private String name;
    private int empId;
    private double salary;
    public void setSalary(double salary)
    {
        if(salary <=0)
        {
            System.out.println("Invalid Salary");
            //this.salary = 0.0;
            return;
        }
        this.salary = salary;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public int getEmpId()
    {
        return this.empId;
    }
    public void setEmpId(int empId)
    {
        this.empId = empId;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void displayEmployeeDetails()
    {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.empId);
        System.out.println("Salary: " + this.salary);
    }
}
public class EmployeeSalarySystem{
    public static void main()
    {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Welcome Employee Salary System");
        System.out.println("--------------------------------------------------------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee's Name");
        String name = sc.nextLine();
        System.out.println("Enter Employee's ID ");
        int empId=sc.nextInt();
        System.out.println("Enter Employee's Salary");
        double salary=sc.nextDouble();
        Employee es= new Employee();
        es.setSalary(salary);
        es.setEmpId(empId);
        es.setName(name);
        es.displayEmployeeDetails();
        sc.close();
    }
}
