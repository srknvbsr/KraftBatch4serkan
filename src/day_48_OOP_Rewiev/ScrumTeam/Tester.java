package day_48_OOP_Rewiev.ScrumTeam;

public class Tester extends Employee implements DevTeam{
public String programmingLanguage;

    public Tester(String name, int age, char gender,   double salary, int id, String departmentName,String programmingLanguage) {
        super(name, age, gender, "Tester", salary, id, departmentName);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public void coding() {
        System.out.println(jobTitle+" "+name+" is coding in testing framework using"+programmingLanguage);

    }
    public void createTicket(){
        System.out.println(jobTitle+" "+name+" is finding bugs");
    }

}
