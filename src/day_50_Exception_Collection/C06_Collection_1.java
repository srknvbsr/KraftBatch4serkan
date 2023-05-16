package day_50_Exception_Collection;

import day_43_IntheritanceAndAccessKeyword.Vehicle;
import day_48_OOP_Rewiev.ScrumTeam.Person;

import java.util.ArrayList;

public class C06_Collection_1 {
    public static void main(String[] args) {
        ArrayList<Vehicle> arrayList = new ArrayList<>();
        //Collection her zaman objeleri kabul eder.

        Person person = new Person("Serkan", 38, 'M');
        Person person1 = new Person("Ayşe", 40, 'F');
        Person person2 = new Person("Emine", 45, 'F');
        arrayList.add(person);
        arrayList.add(person1);
        arrayList.add(person2);

        System.out.println("--------------------------------------------------------------");
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(25);
        arrayList2.add(35);
        arrayList2.add(45);
        arrayList2.add(55);
        System.out.println(arrayList2.size());
        System.out.println(arrayList2.get(0));
        System.out.println(arrayList2.contains(25));

        System.out.println("--------------------------------------------------------------");
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(65);
        arrayList1.add(75);
        System.out.println(arrayList1);//[65, 75]
        System.out.println(arrayList2);//[25, 35, 45, 55]
        System.out.println(arrayList2.addAll(arrayList1));
        System.out.println(arrayList2);//[25, 35, 45, 55, 65, 75]
        System.out.println(arrayList2.size());
        System.out.println(arrayList1.get(0));
        System.out.println(arrayList2.removeAll(arrayList1));
        System.out.println(arrayList1.size());
        System.out.println(arrayList1);
        try {
            System.out.println(arrayList1.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(arrayList2);

    }//MAİN METOD SON SÜSLÜ PARANTEZ.
}
