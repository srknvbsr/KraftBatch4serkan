package day_48_OOP_Rewiev.ScrumTeam;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("serkan", 37, 'M');
        System.out.println(person);
        Employee employee = new Employee("Ahmet", 30, 'M',
                "Developer", 32000, 325633215, "LOGO");
        System.out.println(employee.age);
        System.out.println(employee.departmentName);
//employee.getSalary()//Top secret:)

        Employee employee1=new Employee("Ayşe",32,'F',"Developer",33000,12345,"IT");
        System.out.println(employee1.getId());
        employee1.work();
        employee1.eat("Hamburger");

    }

}
