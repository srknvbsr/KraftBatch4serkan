package day_17_Methods;

public class C02_Tahmin_Oyunu {
    public static void main(String[] args) {

        // Bilgisayarın tuttuğu 0 dahil-50 arası
        // sayısıyı 5 hamlede bulma
        // tuttuğu sayıdan düşük bir tahmin yaparsak yukarı
        //tuttuğu sayıdan yüksek bir tahmin yaparsak aşağı
//*************************************************************BEMİM ÇÖZDÜĞÜM **************************************************************************************************
       /* Random random=new Random();
        int sayi= random.nextInt(50);
        Scanner scan=new Scanner(System.in);
        int hak=1;
        System.out.println("Tahmin Oyununa HoşGeldiniz:");
        System.out.println("Lütfen aklınızdan bir sayi tutunuz ve söyleyiniz: \n Sadece 5 hakkınız vardır.");


        while (true){
            System.out.println(hak+" . Hakkınız= ");

            int tahmin= scan.nextInt();
            if(tahmin>sayi){
                System.out.println("Lütfen aşağı bir sayı söyleyiniz:");
                System.out.println("Sadece"+(5-hak)+ "hakkınız kaldı");

            } else if (tahmin<sayi)
            {
                System.out.println("Lütfen yukarı bir sayı söyleyiniz:");
                System.out.println("Sadece"+(5-hak)+ "hakkınız kaldı");
            }else{
                System.out.println("Tebrikler Bildiniz:");
                                break;
            }
                        if(hak==5){
                break;

            }
            hak++;



        }
        //*************************************************************HOCANIN ÇÖZDÜĞÜ **************************************************************************************************
// Bilgisayarın tuttuğu 0 dahil-50 arası
        // sayısıyı 5 hamlede bulma
        // tuttuğu sayıdan düşük bir tahmin yaparsak yukarı
        //tuttuğu sayıdan yüksek bir tahmin yaparsak aşağı

        Random random=new Random();
        int sayi= random.nextInt(50);

        //5 yukarı
        // 30 aşağı
        // tebrikler
        //malesefe bilemedin tuttuğum sayı 28
        Scanner scan=new Scanner(System.in);
        int i=1;
        while(i<=5){
            System.out.print(i+".Tahmin: ");
            int tahmin= scan.nextInt();
            if(tahmin>sayi && i!=5){
                System.out.println("Aşağı");
            }else if(tahmin<sayi && i!=5){
                System.out.println("Yukarı");
            }else if(tahmin==sayi) {
                System.out.println("Tebrikler");
                break;
            }
            i++;
            if(i==6){
                System.out.println("malesef bilemedin tuttuğum sayı: "+sayi);

            }




        }

        */






    }
}



