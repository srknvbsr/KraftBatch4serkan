package day_58_abstractionRewiev.AbstractionRewiev;

import java.util.*;

public class C04_CollectionRewiev {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        System.out.println(set);
        List<String> group = new Stack<>();
        group.addAll(Arrays.asList("Hans", "Sam", "Tony", "Jony", "Hergel", "Frank"));


    }

}

