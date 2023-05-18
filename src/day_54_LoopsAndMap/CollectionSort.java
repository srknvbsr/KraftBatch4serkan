package day_54_LoopsAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static day_17_Methods.C04_Methods_02.max;

public class CollectionSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 43, 2, 4, 5, 1, 99, 67);
        List<String> list2 = Arrays.asList("Harun", "Ahmet");

        List<Integer> yenilist = Arrays.asList(12, 43, 2, 4, 5, 1, 99, 67);
       /* System.out.println(yenilist);
        System.out.println(yenilist.get(0));
        Collections.sort(yenilist);
        System.out.println(yenilist);
        System.out.println(yenilist.get(0));

        */
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(list);
        Collections.reverse(list);


    }

    public static int max(List<Integer> list) {
        List<Integer> copyList=new ArrayList<>(list.size());

      copyList.addAll(list);
      Collections.sort(copyList);

return copyList.size();

    }
}


