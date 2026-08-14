class Employee {
    private int empId;
    private  String empName;
    private double salary;
    public Employee(int empId, String empname, double salary) {
        this.empId = empId;
        this.empName = empname;
        this.salary = salary;
    }
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "PRIYANKA", 100000);

        System.out.println("Employee Details");
        emp.display();
    }
}

OUTPUT

Employee Details
Employee ID: 101
Employee Name: PRIYANKA
Salary: 100000.0

