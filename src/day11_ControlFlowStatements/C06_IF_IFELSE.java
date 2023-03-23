package day11_ControlFlowStatements;

import java.util.Scanner;

public class C06_IF_IFELSE {
    public static void main(String[] args) {
        /*
        //kullanıcıdan A ve B olan iki sayı alınız.ve bunlarI karşılaştırın.
        //A büyüktür b den
        //b Büyüktür A dan
        //A ve B eşittir.
        int a = 10;
        int b= 20;
        if(a>b){
            System.out.println("A büyüktür B den");
        } else if (a==b) {
            System.out.println("A ve B eşişttir.");

        }else{
            System.out.println("B büyüktür A dan");
        }


        //*******************************************************
        System.out.println("A");
        if(false){
            System.out.println("B");
        } else if (false) {
            System.out.println("C");

        } else if (false) {
            System.out.println("D");

        } else  {
            System.out.println("E");

        }
        System.out.println("F");


        //*****************************************************************
        //bir program yazın eğer x in değeri 10 ise ve y 20 atansın.
        //değilse y ye 0 atansın.
        int x = 10, y;


        if (x == 10) {
            y = 20;

        } else {
            y = 0;

        }
        System.out.println(y);


        //*************************************************
        //Bir program yazın eğer x in değeri 10 ise y ye 20 atansın,.
        //x in değeri 20 ise y ye 30 atansın,
        //x in değeri 30 ise y ye 40 atansın,.
        // değil ise y ye 0 atansın
        //*************************************************
         //Bir program yazın sıcaklık 20 derece ve üstü ise string message;
        //değişkenin butterfly flies assign edilsin.
        String str = null;
        int degree = 19;
        if (degree >= 20) {
            str = "butterfly flise";
        }
        System.out.println(str);


        //*************************************************
        // Ayseninn cep harçlığı 5 liradan daha az ise babası ona 10 lira versin
        int yasePara =  1
                ;
        if(
                yasePara<5
        ){
            yasePara=yasePara+10;

        }
        System.out.println("Aysenin parası "+yasePara);,


        //*************************************************
       // 2 numara kabul etsin eşit olup olmadığını döndürsün
        int x = 10;
        int y = 10;
        if(x==y){
            System.out.println("sayi esit: ");
        }else{
            System.out.println("sayilar esit değil");


        //*************************************************
        // 2 numara kabul etsin ve büyü olanı versin
        int x = 10;
        int y = 10;
        if(x>y){
            System.out.println(x);
        } else if (x==y)
        {
            System.out.println("sayilar eşit");

        } else{
            System.out.println(y);
        }


        //*************************************************
        //örnek;

        int a, b, c;
        a = 20;
        b = 30;
        c = 30;
        if((a+b)>c){
            c=Math.abs(a-b);
            c=Math.max(a,b)-Math.min(a,b);
            if((a-b)>=0){
                c=a-b;

            }else {
                c=-(a-b);
                c=b-a;

            }

        }
        System.out.println(c);


        //*************************************************
        //3 adet içaçılar alsın ve bunu üçgen olup olmadığını kontrol etsin
        int x,y,z;
        x=50;
        y=60;
        z=60;
        if((x+y+z)==180){
            System.out.println("bu bir üçgendir");
        }else{
            System.out.println("üçgen değildir");
        }



        //*************************************************
        int x, y, z;
        x = 60;
        y = 30;
        z = 90;
        if (x + y + z == 180) {
            if (x == 90 || y == 90 || z == 90) {
                System.out.println("bu bir dik üçgendir.");
            } else {
                System.out.println("bu üçgen bir dik üçgen değildir.");
            }

        } else {
            System.out.println("bu bir üçgen değildir. ");
        }


        //*************************************************
        //Bir program yazın
        // 3 tane numara kabul etsin ve büyük olanı versin.(homework)
        // 2 veya 3 farklı yol ile çözmeye çalışın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 adet sayi giriniz: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ((a > b) && (a > c)) {
            System.out.println("En büyük sayi a'dır.");

        } else if ((b > a) && (b > c)) {
            System.out.println("En büyük sayi b'dir.");
        } else {
            System.out.println("En büyük sayi c'dir.");

        }


        //Bir program yazın
        // 3 tane numara kabul etsin ve büyük olanı versin.(homework)
        // 2 veya 3 farklı yol ile çözmeye çalışın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 adet sayi giriniz: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        Math.max(a,b);
        Math.max(b,c);
            System.out.println("En büyük sayi = "+b);


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 sayi Giriniz: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("En büyük sayi = " + a);
            }else
            {
                System.out.println("En büyük sayi = " + c);
            }
        }

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. sayiyi Giriniz: ");


        int a = scan.nextInt();
        System.out.println("Lütfen 2. sayiyi Giriniz: ");
        int b = scan.nextInt();
        System.out.println("Lütfen 3. sayiyi Giriniz: ");
        int c = scan.nextInt();
        int enBuyukSayi = c;
        if(b>enBuyukSayi){
            enBuyukSayi=b;

        } else if (a>enBuyukSayi) {
            enBuyukSayi=a;
        }
        System.out.println("En büyük Sayi= " +enBuyukSayi);
    }
}

