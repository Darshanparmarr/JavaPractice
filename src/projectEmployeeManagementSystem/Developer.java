package projectEmployeeManagementSystem;

public class Developer extends Employee {
    private  String language;
    private int experience;

    Developer(int id, String name, double salary, String language, int experience){
        super(id, name, salary);
        this.language = language;
        this.experience = experience;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Programming Language : " + language);
        System.out.println("Experience : " + experience + " Years");
    }

}
