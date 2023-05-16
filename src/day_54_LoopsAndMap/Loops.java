package day_54_LoopsAndMap;

import java.util.*;

public class Loops {
    public static void main(String[] args) {


       /* String[] arr = {"HArun", "Mehmet", "Ahmet"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        Set set1 = new HashSet();

        Set<Integer> set = new HashSet<>();

        */

/*List<Integer> list =new ArrayList<>();
list.add(25);
list.add(35);
list.add(8);
list.add(14);

 */
/*
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" , ");

        }

 */
        System.out.println("---------------------------------");
//sen 25 ten küçük olan sayıları sil listi ekrana yazdırın

       /* for (Integer sayi:list) {
            if(sayi<25){
                list.remove(sayi);

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

       /* Set<Integer> set =new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(8);
        set.add(14);

        Set<Integer> set1 =new HashSet<>();
        for (Integer sayi:set) {
            if(sayi>=25){
                set1.add(sayi);
            }
        }
        System.out.println(set1);

        */
//sen 25 ten küçük olan sayıları sil listi ekrana yazdırın
        Set<Integer> set = new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(8);
        set.add(14);


        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int sayi = iterator.next();
            if (sayi < 25) {
                iterator.remove();
            }

        }
        System.out.println(set);




        List<String>list=Arrays.asList("Harun","Hamet","hasan");
        Iterator itr=list.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());

        //Foeach metot

        list.forEach(x-> System.out.println(x));
        set.forEach(y-> System.out.println(y-2));


    }
}
