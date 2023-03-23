package day_17Methods;

import java.util.Scanner;

public class C01_Bank_Questions {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //************************************Örnek1***********************************************************
        //0 ile 100 arasında 30-50 arasındaki sayıları yazdırmadan tüm sayıları yazdıran programı yazınız.
        /*for (int i = 0; i < 100; i++) {
            if(30<=i&&i<=50){
                continue;
            }

            System.out.print(i+ " ");
        }

         */
        //************************************Örnek2***********************************************************
        //0 ile 100 arasında 13 e bölünmeyen sayıları  ekrana yazdıran programı yazınız.
        /*for (int i = 0; i < 100; i++) {
            if(!(i%13==0)){
                continue;
            }

            System.out.print(i+ " ");
        }

         */
        //************************************Örnek3***********************************************************
        //Örnek :
        //Nested loop kullanarak kullanıcıdan hangi işlemi yapmak istediğini sorun. 1 toplama
        //2 Çıkarma 3 çarpma 4 bölme 5 çıkış kullanıcının isteğine göre işlem yapın. Kullanıcının
        //seçimine göre Girilen ekrandan 2 sayı alın ve işlemin sonucunu ekrana yazın çıkmak sonuç
        //0 ise çıkış ilemi yapılacağını kullanıcıya bildirin.
        System.out.println("Lütfen Yapmak istediğiniz işlemi seçiniz. İşleminiz :\n 1.Toplam\n 2.Çıkarma\n 3.Çarpma\n 4.Bölme" +
                "\n 5.Çıkış");
        int choose = scan.nextInt();
        switch (choose){
            case 1:
                System.out.println("Lütfen Birinci sayiyi girniz");
                int s1=scan.nextInt();
                System.out.println("Lütfen Birinci sayiyi girniz");
                int s2=scan.nextInt();
                int toplam=s1+s2;
                System.out.println("toplam = " + toplam);
        }


















        /*double money= 2000;
        outerloop: while (true){
            System.out.println("1.Para Ekle,2.Para Çek,3.Bakiye.Çıkış,");
            System.out.println("Hangi işlemi yapmak istersiniz?");
            int tercih1=scan.nextInt();
            switch (tercih1){
                case 1:
                    while (true)
                    System.out.println("Eklemek istediğiniz Tutarı Giriniz:");
                    //money+=para;
                    System.out.println("bir üst menü için 1 basınız işleme devam için 2 ye basınız");
                    int tercih2=scan.nextInt();
                    if(tercih2==1){
                        continue outerloop;

                    }else if (tercih2==2){
                        continue ;


                    }else{
                        System.out.println("Hatalı bir işlem yapıldığı için kart iade edildi.");
                        break outerloop;
                    }



                    break;
                default:

            }

        }

         */

    }
}
