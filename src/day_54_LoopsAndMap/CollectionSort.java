package day_54_LoopsAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 43, 2, 4, 5, 1, 99, 67);
        List<String> list2 = Arrays.asList("Harun", "Ahmet");
        // System.out.println(list2.get(0));
        // Collections.sort(list2);

        // Collections.sort(list);

        System.out.println(list.get(0));
        System.out.println(max(list));
        System.out.println(list.get(0));

    }

    public static int max(List<Integer> list) {
        List<Integer>copyList=new ArrayList<>();


        copyList.addAll(list);
        Collections.copy(copyList,list);
        Collections.sort(copyList);
        return copyList.get(list.size()-1);
    }


}
