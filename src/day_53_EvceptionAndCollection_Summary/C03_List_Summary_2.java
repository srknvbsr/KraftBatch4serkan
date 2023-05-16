package day_53_EvceptionAndCollection_Summary;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class C03_List_Summary_2 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        LinkedHashSet<String> linkedList=new LinkedHashSet<>();
        arrayList.add("Harun");
        linkedList.add("Harun");
        arrayList.add("Mehmet");
        linkedList.add("Mehmet");
        System.out.println(arrayList);
        System.out.println(linkedList);

    }
}
