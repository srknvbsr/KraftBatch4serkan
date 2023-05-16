package day_51_Collection_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        List<String> letters = new LinkedList<>();
        letters.addAll(Arrays.asList("A","B","R","T","L"));
        List<String> letters1 = new ArrayList<>();
        letters1.add("K");
        letters1.add("R");
        letters1.add("A");
        letters1.add("F");
        letters1.add("T");
        letters1.add("E");
        letters1.add("C");
        letters1.add("H");
        System.out.println(letters1);
        letters1.add("S");
        System.out.println(letters1);
        System.out.println("----------------------------");
        System.out.println(letters1.set(2, "S"));
        System.out.println(letters1);
        System.out.println(letters1.set(3, "L"));
        System.out.println(letters1);
        letters1.add(4,"L");
        System.out.println(letters1);

        List<String> target=new LinkedList<>();
       /* target.add("S");
        target.add("E");
        target.add("R");
        target.add("K");
        target.add("A");
        target.add("N");

        */
        System.out.println(target);
        target.addAll(Arrays.asList("R","T","L","S"));
        System.out.println(target);
        System.out.println(letters1.containsAll(target));
        System.out.println(letters1.indexOf(0));
        System.out.println(target.contains(letters1.indexOf(0)));
        System.out.println("(letters1.retainAll(target)) = " + (letters1.retainAll(target)));
        System.out.println("target = " + target);
        System.out.println("letters = " + letters);
        System.out.println("(letters.retainAll(target)) = " + (target.retainAll(letters)));
        System.out.println("target = " + target);
        System.out.println("letters.removeAll(target) = " + letters.removeAll(target));
        System.out.println("letters = " + letters);


    }
}
