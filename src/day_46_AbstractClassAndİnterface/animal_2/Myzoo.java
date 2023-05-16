package day_46_AbstractClassAndİnterface.animal_2;

public class Myzoo {
    public static void main(String[] args) {
        Cat cat = new Cat("Cesur", "Scottish", 'm', 9, "Medıum", "Grey");
        cat.eat();
        cat.meow();
        cat.play();
        cat.setAge(0);
        System.out.println(cat);
        cat.setSize("Large");
        cat.setName("Kamil");
        System.out.println(cat);
        System.out.println(cat.getClass().getName());


    }
}
