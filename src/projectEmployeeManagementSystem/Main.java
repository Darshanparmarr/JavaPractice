package projectEmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {

        System.out.println("======== Employee management System ========");
        Company.showCompany();
        System.out.println();

        Employee emp = new Employee(101, "Rahul", 50000);
        emp.display();
        System.out.println();

        Manager manager = new Manager(102, "Priya", 80000, "HR", 10000);
        manager.display();
        System.out.println();

        Developer developer = new Developer(103, "Aman", 70000, "Java", 3 );
        developer.display();
        System.out.println();

        System.out.println("==== Runtime Polymorphism ====");
        Employee e = new Manager(104, "Karan", 90000, "Sales", 15000 );
        e.display();
        System.out.println();

        e = new Developer(105, "Riya", 65000, "Python", 2 );
        e.display();
        System.out.println();

        System.out.println("====== toString() ======");
        System.out.println(emp);
        System.out.println();

        System.out.println("Total Employees : "+Employee.totalEmployees);

    }
}
