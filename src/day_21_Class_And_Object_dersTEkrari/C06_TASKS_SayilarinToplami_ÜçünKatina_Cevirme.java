package day_21_Class_And_Object_dersTEkrari;

import java.util.Scanner;

public class C06_TASKS_SayilarinToplami_ÜçünKatina_Cevirme {//Konsoldan

    //kullanıcıdan 2 sayı almanızı sağlayan bir
    //metodu çağırı n İkinci sayı 3 ün katı olan bir sayı değilse,
    //başka bir metodtan geçirin ve 3 katı olacak ş ekilde size
    //döndürsün Sonra bu sayıları kabul eden başka bir
    //metotla da sayıları toplayın.
    public static void main(String[] args) {
        //sayiAl(); bu metod void ile olan kısımda geçerlidir.
        System.out.println("sayiAl() = " + sayiAl());


    }
//eğer void değilde int olarak girmek istersek sout olan bölüm kaldırılır yerine return yazılarak
    //döndürülür.main metoduna da ssout eklenerek ekrana yazılması sağlanır.
    public static int sayiAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz:");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen bir sayi giriniz:");
        int sayi2 = scan.nextInt();
        int sayi3=ucunKati(sayi2);
        //System.out.println(sayilarinToplami( sayi1, sayi3));
        return sayilarinToplami( sayi1, sayi3);
    }

    private static int ucunKati( int sayi2) {
        if(sayi2%3==0){
            return sayi2;


        }else {
            return sayi2-sayi2%3;
        }
    }

    private static int sayilarinToplami(int x,int y) {
        return x+y;
    }

    }



