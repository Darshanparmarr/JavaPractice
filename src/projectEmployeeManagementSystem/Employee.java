package projectEmployeeManagementSystem;

public class Employee {
    private int id;
    private String name;
    private double salary;

    static  int totalEmployees = 0;

    Employee(){
        System.out.println("Employee Created");
        totalEmployees++;
    }

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateSalary(){
        return  salary;
    }

    public double calculateSalary(double bonus){
        return salary + bonus;
    }

    public void display(){
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
