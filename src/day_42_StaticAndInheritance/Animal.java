package day_42_StaticAndInheritance;

import day_40_Encapsulation.Person;

public class Animal {
    String name;
    private int Boyu;//özeliğini vermek istedmediklerine private alınır.
    boolean isTuylu;


    public void yemekYe() {
        System.out.println(this.name + " yemek yiyor");


    }


}
