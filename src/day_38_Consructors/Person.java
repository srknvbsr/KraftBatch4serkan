package day_38_Consructors;

public class Person {
    public String name;
    public char gender;
    public int age;


    public Person() {

    }

    public Person(String ad, char cinsiyet, int yas) {
        this.name = ad;
        this.gender = cinsiyet;
        this.age = 25;


    }
    public String toSting(){
        return"Person{name="+name+", gender=  " +
                ""+gender+" age="+age+"}";
    }

}
