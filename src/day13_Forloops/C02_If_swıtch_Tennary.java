package day13_Forloops;
import java.util.*;

public class C02_If_swıtch_Tennary {
    public static void main(String[] args) {
        /* Kullanicidan bir harf isteyin
         o harfle baslayan gun ismi varsa yazdirin
         yoksa "gecersiz harf" yazdirin*/
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf = scan.next().charAt(0);//Scanner sınıfı ile harf alamıyoruz.sacn.next()String aldık.
                                            // charAt(0) yazarak bu aldığızı kelimenin ilk harfini almış olduk.
        System.out.println(harf);
        if(harf == 'p' || harf=='P'){
            System.out.println("Pazar,Pazartesi,Perşembe");

        } else if (harf == 's' ||harf=='S') {
            System.out.println("Salı");


        } else if (harf == 'c' || harf == 'C') {
            System.out.println("Carşamba,Cuma,Cumartesi");


        }else {
            System.out.println("Geçersiz bir harf girdiniz:");
        }
        System.out.println("***********************************************************");
        switch (harf){
            case 's','S':
                System.out.println("Salı");
                break;
            case 'c','C':
                System.out.println("Carsamba  , Cuma , cumartesi");
                break;
            case 'p','P':
                System.out.println("Pazar,Pazartesi,Perşembe");
                        break;
            default:
                System.out.println("Harf girişi yapmadın ya da geçersiz bir harf girdiniz: ");
        }
        System.out.println("***********************************************************");
String result = (harf == 'p'|| harf== 'P') ? "Pazar , PAzartesi , PErşembe":"Yanlış";
        System.out.println(result);


    }
}
