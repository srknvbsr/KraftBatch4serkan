package day_52_Collection2;

import java.util.*;

public class C03_SetPractice {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,400,50,60,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        System.out.println("list = " + list);
        System.out.println("list.get(3) = " + list.get(3));
        System.out.println("------------------------------------------------");

        Set<Integer>hashSet=new HashSet<>();                             //Random
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));

        System.out.println("hashSet = " + hashSet);
        hashSet.addAll(Arrays.asList(null,null,null));
        System.out.println("hashSet = " + hashSet);

        System.out.println("------------------------------------------------");

        Set<Integer>linkedHashSet=new LinkedHashSet<>();                    //Insert Order Preserved,sıralı
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        System.out.println("linkedHashSet = " + linkedHashSet);
        linkedHashSet.addAll(Arrays.asList(null,null,null));
        System.out.println("linkedHashSet = " + linkedHashSet);

        System.out.println("------------------------------------------------");


        Set<Integer>treeSet=new TreeSet<>();                                //Sorted Ascending(Artan şelkilde artan )
        treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        System.out.println("treeSet = " + treeSet);//null veri almıyor.
       // treeSet.addAll(Arrays.asList(null,null,null));//RunTime error



    }
}
