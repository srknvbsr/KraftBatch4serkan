package day_40_Encapsulation;

public class C01_EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("", 'p', 30, 32000);
        //employee1.name; kırmzıız yanar name get metodu olsada
        // ancak metodla değişkne erişebiliriz
        System.out.println("employee1.getName() = " + employee1.getName());
        System.out.println("employee1.getGender() = " + employee1.getGender());
        Employee employee2 = new Employee("serkan", 'A', -20, 32000);
        System.out.println("employee2 = " + employee2);
        employee2.setGender('M');
        employee2.setAge(38);
        employee2.setSalary(38000);
        System.out.println("employee2 = " + employee2);
        Employee employee3 = new Employee("", 'A', -30, -32000);
        System.out.println("employee3 = " + employee3);


    }
}
