package day_46_AbstractClassAndİnterface.animal_2;

public class Tiger extends Animal implements Wild{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating deer");

    }


    @Override
    public void hunt() {
        System.out.println(getName()+" " +
                "is hunting deer");

    }

    @Override
    public void fly() {
        System.out.println(getName()+ "cannot fly");
    }


}
