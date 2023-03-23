package day12_SwitchCaseDersTekrarı;

import java.util.Scanner;

public class C04_Nested_IF {
    public static void main(String[] args) {
        //***************SORU1*********************************
        // konser girişte kullanıcıya 18 yaşında olup olmadığını sorsunlar
        //18 yaşının altında ise giremezsinz
        //**************SORU2*********************************
        //18 ve üzerinde ise yanında bayan olup olmadığını sorun
        //bayan yok ise giremez
        //Bayan var ise yüzme bilip bilmediğini sorun
        //yüzme bilmiyorsa giremez.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lüften yaşınızı söyleyiniz:");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("Yanonızda bir bayan var mı? YAnıtınız Evet veya Hayır mı");
            String yanıt = scan.next();

            if (yanıt.equals("Evet")) {
                System.out.println("HoşGeldiniz:");

            } else if (yanıt.equals("Hayır")) {
                System.out.println("Giremezsiniz");
            }else {
                System.out.println("Yanıt Yanlış verdiniz:");

        }
            System.out.println("Yüzme biliyor musunuz?");
            String yanıt1 = scan.next();

            if(yanıt1.equals("evet")){
                System.out.println("Girebilirsiniz");

            } else if (yanıt1.equals("Hayır")) {
                System.out.println("Giremezsiniz");

            }else {
                System.out.println("Yanıt Yanlış verdiniz:");

            }


        } else

    {
        System.out.println("Giremezsiniz");
    }
}
}
