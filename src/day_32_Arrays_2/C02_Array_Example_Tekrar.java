package day_32_Arrays_2;

import java.util.Scanner;

public class C02_Array_Example_Tekrar {
    public static void main(String[] args) {
        //Kullanıcıdan 3 adet keli alın ve bu aşdığın kelimeleri aray içerisne atarak konsole yazdırın.
        String array[]=new String[3];
        Scanner scan=new Scanner(System.in);
        System.out.println("1.kelime Giriniz: ");
        String kelime1=scan.nextLine();
        array[0]=kelime1;
        System.out.println("2.kelime Giriniz: ");
        String kelime2=scan.nextLine();
        array[1]=kelime2;
        System.out.println("3.kelime Giriniz: ");
        String kelime3=scan.nextLine();
        array[2]=kelime3;
        System.out.println("Lütfen seçmek istediğiiz kelime için (1-2-3)ten birisini seçiniz: ");
        int tercih=scan.nextInt();
       switch (tercih){
            case 1:
                System.out.println(array[0]);
                break;
            case 2:
                System.out.println(array[1]);
                break;
            case 3:
                System.out.println(array[2]);
                break;
            default:
                System.out.println("Hatalı bir giriş yaptınız (1-2-3 arası bir rakam seçiniz)");

        }


    }

}
