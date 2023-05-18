package day_55_MapAndFinish;

import java.util.*;

public class C02_IteratorSummary {
    public static void main(String[] args) {
        //------------"DERS TEKRARI ESNASINDA YAPTIĞIM ÇALIŞMALAR"-------------------------------------
        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(8);
        set.add(35);
        set.add(27);

        for (Integer x : set) {
            if (x > 25) {
                set.remove(x);
            }
            System.out.println(set);//ConcurrentModificationException hatasu verir.
        }


        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 25) {
                iterator.remove();
                set.remove(number);
                // set ile itaretor aynı anda çalışmıyor.
                // Yani adresini kaybediyor.hasNext() kaybediyor.
                System.out.println(number);


                //4.forEach method that came with java 8 (lambda expression)
                set.forEach(x -> System.out.println(x));//x-> ifaesi lambda ifadesi olarak geçer.
                List<String> list = new ArrayList<>();
                list.add("harun");
                list.add("Mehmet");
                list.add("Ahmet");
                list.forEach(x -> System.out.println(x + " Hoşgeldiniz"));


            }
        }
    }
}

//--------------------HOCA DERS ANLATIRKEN ÇAIŞMALARIM---------------------------------
        /*Set<Integer> set=new TreeSet<>();
        set.add(12);
        set.add(8);
        set.add(9);
        set.add(35);
        set.add(27);
        Iterator<Integer>iterator=set.iterator();
        //12,8,35,27
        while (iterator.hasNext()){
            try{
            Integer sayi=iterator.next();
            if(sayi>25){
               set.remove(sayi);
            }

            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(set);//ConcurrentModificationException Bu hatanın sebebi, döngü sırasında
        // yapılan yapısal bir değişiklik (eleman silme) ile iterator'un aynı anda çalışmasıdır.



       /* for (Integer x:set) {
            if(x>25){
                set.remove(x);

            }


        }
        System.out.println(x+" ");

        */


