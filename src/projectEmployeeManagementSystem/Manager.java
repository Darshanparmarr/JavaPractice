package projectEmployeeManagementSystem;

public class Manager extends Employee {

    private String department;
    private double bonus;

    Manager(int id, String name, double salary, String department, double bonus){
        super(id, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    @Override
    public  void display(){
        super.display();
        System.out.println("Department : " + department);
        System.out.println("Bonus : " + bonus);
        System.out.println("Total Salary : " + calculateSalary(bonus) );
    }

}
