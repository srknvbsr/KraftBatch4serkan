package day12_SwitchCaseDersTekrarı;

import java.util.Scanner;

public class C05_Example {
    public static void main(String[] args) {
        //öğrencini ortalamasını alınzı.
        //ortalama 50 altında ise zayıf
        //50 dahil 70 arası orta
        //70 dahil 85 arası iyi
        //85 ve üzeri pekiyi
        //95 ve üzeri alanlar için başarı belgesi alsın
        //ekrana yazdırınız

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen öğencinin Ortalamasını Giriniz:");
        int ort = scan.nextInt();
        if(ort<50){
            System.out.println("Zayıf");
        } else if (ort>=50&&ort<70) {
            System.out.println("Orta");

        } else if (ort>=70&&ort<85) {
            System.out.println("İyi");

        }else if(ort>=95&&ort<=100){
            System.out.println("Başarı Belfgesi almaya hak kazandınız");
        }else {
            System.out.println("Hatalı bir not giridniz");
        }



    }

}
