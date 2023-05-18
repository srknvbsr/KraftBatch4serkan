package day_55_MapAndFinish;

import java.util.*;

public class C03_MapMethods {
    public static void main(String[] args) {
        //------------"DERS TEKRARI ESNASINDA YAPTIĞIM ÇALIŞMALAR"-------------------------------------
        //put() ,get(),values(),keyset(),clear(),containsKey(),remove(),entrySet(),equals(),forEach(),isEmpty()
        //putAll(),replace()


        Map<Integer, String> map = new TreeMap<>();//Keylere göre doğal sıralama
        map.put(12, "Harun");
        map.put(13, "Ziya");
        Map<Integer, String> map2 = new TreeMap<>();//Keylere göre doğal sıralama
        map.put(12, "Harun");
        map.put(13, "Ziya");
        System.out.println("map.get(13) = " + map.get(13));
        System.out.println("map.values() = " + map.values());

        Collection<String> collection = map.values();
        System.out.println("collection = " + collection);// System.out.println("map.values() = " + map.values());
        //aynı ifade bakarsanız.
        Set<Integer> set = map.keySet();//set burada referans tipi
        //System.out.println("set = " + set);
        //System.out.println("set.isEmpty() = " + set.isEmpty());
        List<Integer> list = new ArrayList<>();
        set.forEach(x -> list.add(x));
        Collections.sort(list);
        System.out.println("list = " + list);
        //Bu kodun amacı, bir Map nesnesinin anahtarlarını bir listeye kopyalamak ve
        // bu listeyi sıralamaktır. Set üzerinde forEach kullanılarak her bir anahtar elemanı list listesine eklenir.
        // Daha sonra Collections.sort metodu kullanılarak list listesi sıralanır. Sonuç olarak,
        // list listesi anahtarların sıralı bir versiyonunu içeren bir liste olarak elde edilir.
        //
        //Not: Bu kod parçasında Set ve List nesneleri referans tiplerdir, yani bellekte kendi başlarına
        // birer nesne olarak yer alırlar. set ve list değişkenleri ise bu nesnelere referans tutucu olarak hizmet eder
        // ve ilgili nesnelerin bellekteki konumunu işaret ederler.
        System.out.println(Collections.max(map.keySet()));
        Integer id = list.get(list.size() - 1);
        System.out.println(id);
        System.out.println("--------------------------------------");
        // System.out.println("map.remove(12,\"harun\") = " + map.remove(12, "Harun"));
        System.out.println("map = " + map);
        System.out.println("map.entrySet() = " + map.entrySet());
        System.out.println("map.equals(map2) = " + map.equals(map2));
        map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
        System.out.println("map ilk değer: = " + map);
        map.putAll(map2);
        System.out.println("map son değer= " + map);

    }

}
//--------------------HOCA DERS ANLATIRKEN ÇAIŞMALARIM---------------------------------


        /*Map<Integer,String > map=new TreeMap<>();//keylere göre dğal sıralama

        map.put(14,"Harun KOÇ");
        map.put(13,"Ziya ASLAN");
        System.out.println("map.get(12) = " + map.get(12));
        System.out.println("map.values() = " + map.values());
        System.out.println("map.keySet() = " + map.keySet());
        Set<Integer>set=map.keySet();
        System.out.println("map.entrySet() = " + map.entrySet());//map.entrySet() = [12=Harun KOÇ, 13=Ziya ASLAN]
        Map<Integer,String > map2=new TreeMap<>();//keylere göre dğal sıralama

        map.put(12,"Harun KOÇ");
        map.put(13,"Ziya ASLAN");
        System.out.println("map.equals(map2) = " + map.equals(map2));
        System.out.println("map.isEmpty() = " + map.isEmpty());
        map.putAll(map2);
        System.out.println(map);
        System.out.println("map.remove(12,\"Harun KOÇ\") = " + map.remove(12, "Serkan ÇAĞLAR"));
        System.out.println("map = " + map);


    }
}

         */
