package day_55_MapAndFinish;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("harun", "Koç", 15);
        Ogrenci ogrenci2 = new Ogrenci("Ayşe", "Çalşkan", 17);
        Ogrenci ogrenci3 = new Ogrenci("Hatice", "Akıllı", 18);

        Map<Integer, Ogrenci> map = new HashMap<>();

        map.put(ogrenci1.getNo(), ogrenci1);
        map.put(ogrenci2.getNo(), ogrenci2);
        map.put(ogrenci3.getNo(), ogrenci3);
        map.get(18).ekleDers("Almanca");
        map.get(17).ekleDers("İngilizce");


        System.out.println("map.get(17).getIsim() = " + map.get(17).getIsim());
        System.out.println("map.get(17).getDersler() = " + map.get(17).getDersler());
        System.out.println("map.get(17) = " + map.get(17));
        //databaselerde map metodu genel olarak çabuluğu sebebiyle çok kullanılır.
















       /* List<Ogrenci> list = new ArrayList<>();
        list.add(ogrenci1);
        list.add(ogrenci2);
        list.add(ogrenci3);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNo() == 15) {
                list.get(i).ekleDers("Almanca");
                break;
            }
        }

        System.out.println("ogrenci1.getDersler() = " + ogrenci1.getDersler());

        */


    }
}
 /* Ogrenci ogrenci1=new Ogrenci("Harun","Koç",15);
        Ogrenci ogrenci2=new Ogrenci("Ayşe","Çalışkan",17);
        Ogrenci ogrenci3=new Ogrenci("Hatice","Akıllı",18);

        Map<Integer,Ogrenci>map=new HashMap<>();
        map.put(ogrenci1.getNo(),ogrenci1);
        map.put(ogrenci2.getNo(),ogrenci2);
        map.put(ogrenci3.getNo(),ogrenci3);

        map.get(18).ekleDers("Almanca");
        map.get(17).ekleDers("İngilizce");


        //System.out.println("map.get(17).getIsim() = " + map.get(17).getIsim());
        System.out.println("map.get(17).toString() = " + map.get(17).toString());

  */

