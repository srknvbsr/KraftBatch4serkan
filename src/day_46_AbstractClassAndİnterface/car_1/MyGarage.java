package day_46_AbstractClassAndİnterface.car_1;

public class MyGarage {
    public static void main(String[] args) {


        //Car car1=new Car("TOGG","T10X","KapoDodkya",2023,50000)
        //WE cannot create an object from an abstract class

        Honda honda1 = new Honda("Accord", "Siyah", 2023, 50000);
        Audi Audi = new Audi("RS", "Mavi", 2023, 50000);
        Togg Togg = new Togg("T10X", "Pembe", 2023, 50000);

        System.out.println(honda1);
        System.out.println(Audi);
        System.out.println(Togg);

        Togg.setColor("Anadolu");
        honda1.setColor("Red");
        Audi.setColor("Black");

        honda1.setPrice(90000);
        Audi.setPrice(30000);
        Togg.setPrice(10000);

        System.out.println("---------------------------------------------");

        System.out.println(honda1);
        System.out.println(Audi);
        System.out.println(Togg);
    }
}
