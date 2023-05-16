package day_52_Collection2;

import java.util.*;

public class C05_SetPractice3 {
    public static void main(String[] args) {
        String[] arr={"Book","Book","Notebook","Pen","Pencil","Pen","Spoon","Ruler","Phone","Mirror","Phone","Brush",null};

        Set<String>uniqueItemsInMyBag=new HashSet<>(Arrays.asList(arr));//rastgele yapar sıralamayı
        System.out.println("uniqueItemsInMyBagHashSet = " + uniqueItemsInMyBag);

        Set<String>uniqueItemsInMyBaglinked=new LinkedHashSet<>(Arrays.asList(arr));//alfabetik sıraya göre koyar.
        System.out.println("uniqueItemsInMyBaglinked = " + uniqueItemsInMyBaglinked);

        Set<String>uniqueItemsInMyBagTree=new TreeSet<>(Arrays.asList(arr));//treeSette null yazılırsa hata verir.
        System.out.println("uniqueItemsInMyBagTree = " + uniqueItemsInMyBagTree);


       // arr= uniqueItemsInMyBagTree.toArray(new String[0]);
       // System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));



    }


}
