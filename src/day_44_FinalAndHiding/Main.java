package day_44_FinalAndHiding;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


       // C c = new C();
        //C c1 = new C();
       // C c2 = new C();
       // A a = new A();// Sadece A blokları çalışlır.
       // A a1 = new A();// Sadece A blokları çalışlır.

       // B b = new B();
        // B b1 = new B();


        /* A a=new A();
          B b=new B();
         C c=new C();

         */

      /*  FinalExample finalExample = null;
        System.out.println(finalExample.X);
        finalExample.method( );
        System.out.println(finalExample.X);

        finalExample = new FinalExample();

       */

//String[] arr=new String[10];Kapasite zorunlu hatırlatma.

       /*final String[] strArr = {"harun", "Mehmet", "Ahmet"};

        String[] strArr2 = {"Orhan", "cansu", "Naime"};

       //strArr = strArr2; //sttrArr final olduğu için ref değişmez.
        strArr2 = strArr;
        strArr[0] = "Orhan";
         System.out.println(strArr[0]);

        */


        final ArrayList<Integer> arrayList = new ArrayList<>();
        //ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList.add(250);
        arrayList.add(300);
        arrayList.set(0, 600);
       // arrayList=arrayList2;bu olmaz cünki referans değiştirmeye izin vermez.
        //arrayList=arrayList2;//finalsız arraylist için
        arrayList2=arrayList;//İziin verir

        System.out.println(arrayList2.get(0));//600
        System.out.println(arrayList2.get(1));//300
        System.out.println(arrayList2.get(1));//300
        System.out.println(arrayList2.get(0));//finalsz örnek
        String str = new String("Harun");
        str = "Mehmet";


    }


}
