package day_54_LoopsAndMap;

import java.util.*;

public class Loops {
    public static void main(String[] args) {


       /* String[] arr = {"HArun", "Mehmet", "Ahmet"};
        for (String str : arr) {
            System.out.println(str);

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        Set set1 = new HashSet();//Çok eski bir tanımlamadır.Herşeyi alır.


        Set<Integer> set = new HashSet<>();

        */


       /* List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(35);
        list.add(8);
        list.add(14);
        for (Integer sayi : list) {
            System.out.print(sayi+" ");

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");


        }


        System.out.println("---------------------------------");


//sen 25 ten küçük olan sayıları sil listi ekrana yazdırın
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(25);
        list.add(35);
        list.add(8);
        list.add(14);

        */

    /* for (Integer sayi:list) {
            if(sayi<25){
                list.remove(sayi);
//for i de olan i-- olayı burada olamayacağı için burada silme olayını gerçekleştiremeyiz.
                //Foreach te listimizin ne kadar döneceğine karar veren unsur listimizin
                //sizedır.
        }

        }
        System.out.println(list);

     */

      /* for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<25){
                list.remove(i);
                i--;
            }

        }
        System.out.println(list);

       */


       /*  Set<Integer> set = new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(8);
        set.add(14);

       Set<Integer> set1 = new HashSet<>();//Setlerde fori olmaz çünki setlerde indek numarası alınmaz.
        for (Integer sayi : set) {
            if (sayi >= 25) {
                set1.add(sayi);
            }
        }
        System.out.println(set1);
        System.out.println(set1.size());

       */


//sen 25 ten küçük olan sayıları sil listi ekrana yazdırın
      /*  Set<Integer> set = new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(8);
        set.add(14);
        Set<Integer> set1 = new HashSet<>();//Yeni bir set oluştururak set1 oluşturduk.

       */

       /* try{
            for (Integer sayi: set) {
                if(sayi<25){
                    set1.add(sayi);
                }

            }
            System.out.println(set1);
        }catch (Exception e){
            System.out.println(set.getClass().getName());
        }

        */


       /* Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int sayi = iterator.next();
            if (sayi < 25) {
                iterator.remove();
            }

        }
        System.out.println(set);

        System.out.println("---------------------------------------");
        List<String> names = new ArrayList<>();
        names.add("Serkan");
        names.add("Esra");
        names.add("Busra");
        names.add("Neva");
        System.out.println("İlk liste " + names);
        String target = "Serkan";
        Iterator<String> iterator1 = names.iterator();
        while (iterator1.hasNext()) {
            String name1 = iterator1.next();
            if (name1.equalsIgnoreCase(target)) {
                iterator1.remove();
            }

        }
        System.out.println("Sonraki liste " + names);

        */

       /* List<String> list = Arrays.asList("Harun", "Hamet", "hasan");
        Iterator itr = list.iterator();//İterator objesi
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());

        */

       //Foeach metot
        Set<Integer> set = new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(8);
        set.add(14);
        List<String> list = Arrays.asList("Harun", "Hamet", "hasan");
        list.forEach(x -> System.out.println(x));
        set.forEach(y -> System.out.println(y - 2));
        List<Integer>list1=new ArrayList<>();
        set.forEach(y->list1.add(y));
        System.out.println(list1);//setin içersindie buluunan ınteger değerleri hzlıca yeni oluşturlan
        //list1 arrayın içerine atadık.Kısa ve hızlı bir işlem için kullanabiliriz.Obje obje gezmek içinde
        //ıteratoru kullanabiliriz.


    }
}


