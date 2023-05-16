package day_48_OOP_Rewiev.ScrumTeam;

public class Developer extends Employee implements DevTeam{
    public String programmingLanguage;

    public Developer(String name, int age, char gender, String jobTitle, double salary, int id, String departmentName, String programmingLanguage) {
        super(name, age, gender, jobTitle, salary, id, departmentName);
        this.programmingLanguage = programmingLanguage;
    }
    public void fixBug(){
        System.out.println(jobTitle+" "+name+" is coding");

    }
   public void coding(){
        System.out.println(jobTitle+" "+name+" is programming "+programmingLanguage);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
