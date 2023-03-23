package day12_SwitchCase;

import java.util.Scanner;

public class C04_Nested_IF {
    public static void main(String[] args) {
        //
        //konser girişte kullanıcıya 18 yaşında olup olmadığını sorsunlar
        //18 yaşının altında ise giremezsinz
        //18 ve üzerinde ise yanında bayan olup olmadığını sorun
        //bayan yok ise giremez
        //Bayan var ise yüzme bilip bilmediğini sorun
        //y,zöe bilmiyorsa giremez

        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınız");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("Yanınızda Bayan var mı? Evet/Hayır");
            String cvp = scan.next();
            if (cvp.equals("Evet")) {
                System.out.println("Yüzme Biliyor musunzu");
                String cvp2 = scan.next();
                if(cvp2.equals("Evet")){
                    System.out.println("Hoşgeldiniz");

                }else {
                    System.out.println("Yanını<da bayan olamdığı için giremezsiniz.");
                }


            } else {
                System.out.println("Yanınızda Bayan GEtiriniz Amele seni: ");
            }
        } else {
            System.out.println("Giremezsiniz.");

        }
    }
}
