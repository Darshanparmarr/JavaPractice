package classesJavaOpps.encapsulation;

class Employee{
    private  int empId;
    private String empName;
    private Address address;

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

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "Employee Id : " + empId + " , Employee Name : " + empName + " , Employee Adress : " + address;
    }

}

class  Address{
    private String apartmentName;
    private String city;

    public String getCity() {
        return city;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "apartmentName= " + apartmentName +
                ", city= " + city;
    }
}

public class LearningEncapsulation {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpName("Ram");
        employee.setEmpId(21);

        Address address = new Address();
        address.setCity("Tokyo");
        address.setApartmentName("Oberoi Skycity");

        employee.setAddress(address);
        System.out.println(employee);
        System.out.println(address);
    }
}
