package day_37_ArrayList;

import java.util.ArrayList;

public class C02_ArrayList_Tekrar {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>(100);
        arrList.isEmpty();
        arrList.add("Harun");
        arrList.add("Ziya");
        //arrList.clear();
        //System.out.println(arrList.get(0));
        System.out.println(arrList.get(1));
        System.out.println(arrList.get(arrList.size()-1));//ziya gelir
        System.out.println(arrList.size());
        arrList.add(0,"Mehtap");
        arrList.add(1,"Serkan");
        //arrList.remove(1);
        System.out.println(arrList);
        //System.out.println(arrList.get(1));//String bir ifade verir.

        System.out.println(arrList.set(1, "Ömer"));
        System.out.println(arrList);

        //indeksof
        System.out.println(arrList.indexOf("Ömer"));
        System.out.println(arrList.indexOf("Mahmut"));




    }
}
