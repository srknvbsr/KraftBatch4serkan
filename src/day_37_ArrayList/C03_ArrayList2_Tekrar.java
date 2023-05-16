package day_37_ArrayList;

import java.util.AbstractList;
import java.util.ArrayList;

public class C03_ArrayList2_Tekrar {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("Harun");
        arrList.add("Ziya");
        arrList.add("Mehtap");
        arrList.add("Sami");

        ArrayList<String> arrList2 = new ArrayList<>();
        arrList2.add("Harun");
        arrList2.add("Ziya");
        arrList.removeAll(arrList2);
        System.out.println(arrList.size());
        System.out.println(arrList);
        //Birinci arrayList e elma, armut, kayısı, üzüm, erik;
        //İkinci arrayListe e armut, kayısı, üzüm değerlerini atayalım ve
        //İlk arrayList in içinden ikinci arrayList i çıkartalım.
        ArrayList<String>manav=new ArrayList<>();
        manav.add("elma");
        manav.add("armut");
        manav.add("kayısı");
        manav.add("üzüm");
        manav.add("erik");
        System.out.println(manav.size());
        System.out.println(manav);
        ArrayList<String>manav2=new ArrayList<>();
        manav2.add("armut");
        manav2.add("kayısı");
        manav2.add("üzüm");
        manav.removeAll(manav2);
        System.out.println(manav);
        System.out.println(manav.size());

//5,10,15,15,20,25,25,100,100,500 rakamlarını
// listOfNums isimli
//bir ArrayListe atın ve
//printListNumbers
//listOfNums ); methodu ile yazdıralım.
        ArrayList<Integer> listOfNums=new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(500);
        printList(listOfNums);
        System.out.println(sum(listOfNums));
        System.out.println(dublicated(listOfNums));


    }
    public static void printList(ArrayList arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");


        }


    }
    //sum(listOfNums ); methodu ile de toplam değeri döndürelim.
    public static int sum(ArrayList<Integer> arrayList){
        int result=0;
        for (int i = 0; i < arrayList.size(); i++) {
            result+= arrayList.get(i);

        }return result;
    }
    //duplicate listOfNums ); methodu ile de değerleri dublicate
    //edip list i döndürelim.
    public static ArrayList<Integer>dublicated(ArrayList<Integer>arrayList){
        ArrayList<Integer>yeniArray=new ArrayList<Integer>();

        for (int i = 0; i < arrayList.size(); i++) {
            yeniArray.add(arrayList.get(i));
            yeniArray.add(arrayList.get(i));


        }return yeniArray;
    }
}
