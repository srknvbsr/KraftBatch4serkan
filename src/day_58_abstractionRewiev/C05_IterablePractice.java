package day_58_abstractionRewiev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IterablePractice {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {


        }

        List<Integer>list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        list3.removeIf(each->each<4);
        System.out.println("list3 = " + list3);
    }
}
