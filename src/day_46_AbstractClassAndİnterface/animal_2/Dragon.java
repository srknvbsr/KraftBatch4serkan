package day_46_AbstractClassAndİnterface.animal_2;

public class Dragon extends Animal implements Canfly,Wild{

    public Dragon(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat(){

        System.out.println(getName()+" " +
                "is eating steak");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" " +
                "is flying with a speed of high altitudes");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" " +
                "is hunting snake");
    }




}
