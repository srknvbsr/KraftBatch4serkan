package day_57_OOP;

class Employee {
    private String name;

    private double Salary;

    private char gender;

    public Employee(String name, double salary, char gender) {
        setName(name);
        setSalary(salary);
        setGender(gender);
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new RuntimeException("Salary can not be set to zero or negative number");
        }
        if (salary <= 10000) {
            throw new RuntimeException("Insufficiant Salary for a human being, employees are not your Slaves!!!!!");
        }
        Salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')) {
            throw new RuntimeException("Invalid Name, Please enter 'M'");
        }
        this.gender = gender;
    }


    public String getName() {
        if (name == null) {
            throw new RuntimeException("Name hasn't been set");
        }
        if (name.isEmpty()) {
            throw new RuntimeException("Name can not be set to EMPTY");
        }
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("Name can not be set to NULL");
        }
        if (name.length() < 2) {
            throw new RuntimeException("Name's length can be set to NULL");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                ", gender=" + gender +
                '}';
    }

}


public class C03_Encapsulation {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Serka",23000,'M');//default constructor
        //employee1.name="Serkan";
        // System.out.println("employee1.name = " + employee1.name);
        employee1.setName("Serkan");
        System.out.println("employee1.getName() = " + employee1.getName());
        System.out.println("employee1 = " + employee1);
        Employee employee2 = new Employee("Sener",25000,'M');
        //employee2.setSalary(5000);
        employee2.setGender('F');
        System.out.println("employee2 = " + employee2);

    }
}
