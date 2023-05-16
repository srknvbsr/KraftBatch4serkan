package day_36_WrapperClass;

import java.util.Arrays;

public class C02_WrapperClass_Methods_Ders_Tekrari {
    public static void main(String[] args) {
       /*String str="Bugün hava 40 derece";
        // hava sıcaklığı 10 derece daha artar ise hava sıcaklığı kaç derece olur?
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.length());
        int havaSicakligi = Integer.parseInt(str.split(" ")[2]);
        int yeniHavaSicakligi=havaSicakligi+10;
        System.out.println(yeniHavaSicakligi);

        */

        //"Ali'nin doğum yılı 1996" ise 10 yıl sonra ali kaç yaşında olur?
        //Ali 37 yaşında olur.
        String str = "Ali'nin doğum yılı 1996";
        //System.out.println(Arrays.toString(str.split("'")));
        //System.out.println(Arrays.toString(str.split(" ")));
        String name = str.split("'")[0];
        int yas = Integer.parseInt(str.split(" ")[3]);
        int yeniYas = 2023 - yas + 10;
        //System.out.println(yeniYas);
        System.out.println(name + " " + yeniYas + " yaşında olur.");


    }

}
