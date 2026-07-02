package classesJavaOpps.encapsulation;

class Employee{
    private  int empId;
    private String empName;

    public int getEmpId(){
        return empId;
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }

    public String getEmpName(){
        return empName;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

}

public class LearningEncapsulation {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpName("Ram");
        employee.setEmpId(21);
        System.out.println("Id = " + employee.getEmpId() + " , Name = "+ employee.getEmpName());
    }
}
