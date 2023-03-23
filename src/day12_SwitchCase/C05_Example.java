package day12_SwitchCase;

import java.util.Scanner;

public class C05_Example {
    public static void main(String[] args) {
        //öğrencini ortalamasını alınzı.
        //ortalama 50 altında ise zayıf
        //50 dahil 70 arası orta
        //70 dahil 85 arası iyi
        //85 ve üzeri pekiyi
        //ekrana yazdırınız
        //85 ve üzeri alanlara tatile gitmek istiyor musunuz diye sorunuz
        //eğer gitmek isterler ise
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Ortalamanızı Giriniz: ");
        double ort =scan.nextDouble();
        if(ort<50){
            System.out.println("ZAYIF");
        }else if (ort>=50&&ort<70){
            System.out.println("ORTA");

        }else if (ort>=70&&ort<85){
            System.out.println("İYİ");
        }else {
            System.out.println("PEKİYİ");
            if(ort>=95){
                System.out.println("Başarı Belgesi Almaya Hak Kazandınız: ");
            }

        }

    }

}
