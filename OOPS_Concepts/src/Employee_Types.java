abstract class Employeet {
    public String name;
    public int employeeId;
    public Employeet(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    abstract double calculateSalary();
}
class FullTimeEmployee extends Employeet {
     double salary;
     public FullTimeEmployee(String name ,int employeeId,double salary) {
         super(name,employeeId);
         this.salary = salary;

     }
     @Override
     double calculateSalary()
     {
        return salary;
     }
}
class PartTimeEmployee extends Employeet {
    double hourlyRate;
    int hoursWorked;
    public PartTimeEmployee(String name ,int id,double hourlyRate, int hoursWorked) {
        super(name,id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    double calculateSalary()
    {
        return this.hourlyRate * hoursWorked;
    }
}
public class Employee_Types {
    public static void main(String[] args) {

        Employeet e1 = new FullTimeEmployee("Amit", 101, 60000);
        Employeet e2 = new PartTimeEmployee("Riya", 102, 500, 40);

        System.out.println(e1.calculateSalary()); // 60000
        System.out.println(e2.calculateSalary()); // 20000
    }
}
