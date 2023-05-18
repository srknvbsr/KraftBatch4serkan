package day_54_LoopsAndMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {
/*
        Map map=new HashMap<>();
        Map<String,String> map1=new HashMap<>();
        map.put("123254","Harun");
        map.put("1232545","Serkan");
        map.put("1232546","Busra");
        map.put("1232547","Neva");
        System.out.println(map.get("123254"));
        System.out.println(map.get("1232545"));
        System.out.println(map.get("1232546"));
        System.out.println(map.get("1232547"));


 */
       // Map<String, Double> meyveFiyat = new TreeMap<>();
        Map<String, Double> meyveFiyat = new HashMap<>();
        meyveFiyat.put("Elma", 3.75);
        meyveFiyat.put("Muz", 56.90);
        meyveFiyat.put("Cilek", 50.00);
        meyveFiyat.put("Armut", 30.30);
//TreeMap e göre sıralama:{Armut=30.3, Cilek=50.0, Elma=3.75, Muz=56.9} doğal sıralama
//HashMap e göre sıralama:{Armut=30.3, Muz=56.9, Elma=3.75, Cilek=50.0}

        System.out.println(meyveFiyat);
        System.out.println(meyveFiyat.get("Elma"));
        //System.out.println("meyveFiyat.remove(\"Elma\") = " + meyveFiyat.remove("Elma"));
        System.out.println(meyveFiyat.get("Elma"));//null gelir.
        System.out.println("meyveFiyat.values() = " + meyveFiyat.values());
        System.out.println("meyveFiyat.containsKey(\"Armut\") = " + meyveFiyat.containsKey("Armut"));
        //meyveFiyat.clear();
        System.out.println(meyveFiyat);
        System.out.println("-----------------------------");
        Set<String>set=meyveFiyat.keySet();
        set.forEach(x-> System.out.println(x));











     /*   Map<String,String> map=new HashMap<>();

        map.put("12345","Harun");
        map.put("123456","Harun2");
        map.put("1234567","Harun3");
       // map.put("12345","Harun");
        System.out.println(map.get("123456"));


        //manav meyveler ve fiyatlar

        Map<String,Double> meyveFiyat=new HashMap<>();
        meyveFiyat.put("Elma",3.75);
        meyveFiyat.put("Elma",3.90);
        meyveFiyat.put("Muz",56.90);
        meyveFiyat.put("Çilek",50.0);
        meyveFiyat.put("Armut",30.30);
        meyveFiyat.put("Muz",60.05);
      //  meyveFiyat.remove("Elma");
       // meyveFiyat.clear();

       // System.out.println(meyveFiyat.containsKey("Elma"));
      //  System.out.println(meyveFiyat.containsValue(30.30));
       Set<String> set=meyveFiyat.keySet();
      // set.forEach(x-> System.out.println(x));

        for (String str: set) {
            System.out.println(meyveFiyat.get(str));
        }



        // TreeMap {Armut=30.3, Elma=3.75, Muz=56.9, Çilek=50.0}
        //HashMap  {Armut=30.3, Muz=56.9, Çilek=50.0, Elma=3.75}

      //  System.out.println(meyveFiyat);
     //   System.out.println(meyveFiyat.get("Muz"));




*/


    }


}
