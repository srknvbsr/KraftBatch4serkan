package day_48_OOP_Rewiev.ScrumTeam;

public class Employee extends Person implements DevTeam{


    public String jobTitle;

    private double salary;

    private int id;

    public String departmentName;

    public Employee(String name, int age, char gender, String jobTitle, double salary, int id, String departmentName) {
        super(name, age, gender);//name,age ve gender persone sınıfına ait özellikler,diğerleri kendi sınıfına ait özellikler
        this.jobTitle = jobTitle;
        setSalary(salary);
        setId(id);
        this.departmentName = departmentName;
    }

  /*  public double getSalary() {
        return salary;
    }

   */

    public void setSalary(double salary) {
        if (salary < 0) {
            System.err.println("Invalıd salary" + salary);
        } else {
            this.salary = salary;
        }
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void work() {
        System.out.println(jobTitle + " " + name + " " + "is hard working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    @Override
    public void coding() {


    }
}
