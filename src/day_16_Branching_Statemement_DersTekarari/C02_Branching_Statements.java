package day_16_Branching_Statemement_DersTekarari;

import java.util.Scanner;

public class C02_Branching_Statements {
    public static void main(String[] args) {
        //break ,continue ve return bunların hepsi dallanma ifadesidir.
        //break koolp içierini kırar ve çıkar , continue loop içerisindeki başa döner .
       /* int x = 0;
        for (int i = 0; i < 100; i++)
        {
           x++;
           if(x==5){
               break;
           }
            System.out.println(x+" ");
        }


        //Tek sayıları yazdıran sistem.
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i + " ");
        }


        //0(dahil) ile 20 arasındaki çift sayıların toplamını ekrana yazdıran program yazdırın.
        int toplam=0;
        for(int i = 0;i<=20;i++){
            if(i%2==1){
                continue;
            }
            toplam+=i;

        }
        System.out.println("Çift sayışarin Toplami = "+toplam);

      
        //1 den 100 e kadar 5 in katlarını yazdıran program:
        for (int i = 1; i < 100; i++) {
            if(!(i%5==0)){

                continue;

            }
            System.out.println(i+" ");
        }
        

        System.out.println("Program Başladı");
        System.out.println("B");
        for (int i = 0; i < 10; i++) {
            if(i==5){
                System.out.println("c");
                break;

            }
            if(i>3){
                System.out.println("d");
                continue;
            }
            if(i>2){
                System.out.println("A");
            }


            
        }

        */
        //   // Şifre tanımlayın ve kullanıcıya ekrandan
//// 5 defa şifreyi girmesini isteyin. Her bulamadığında şifre doğru değildir tekrar deneyin ikazı çıksın.
//// Şifreyi bulursa «tebrikler şifre doğru» yazısı gösterildikten sonra programdan çıkış işlemi gerçekleşsin.
        //***********************************************************************************************************
        //Nested loop kullanarak kullanıcıdan hangi işlemi yapmak
// istediğini sorun. 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
// kullanıcının isteğine göre işlem yapın. Kullanıcının seçimine göre Girilen ekrandan
// 2 sayı alın ve işlemin sonucunu ekrana yazın çıkmak sonuç 0  devam etmek için 1 girmesini isteyin.
       /* Scanner scan = new Scanner(System.in);
        outloop:
        while (true) {
            System.out.println("Lütfen yapmak istediğiniz işlemmi seciniz:\n 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış");
            int islm = scan.nextInt();
            switch (islm) {
                case 1:
                    while (true) {
                        System.out.println("Lütfen bir sayi giriniz.");
                        int s1 = scan.nextInt();
                        System.out.println("Lütfen ikinci sayiyi giriniz.");
                        int s2 = scan.nextInt();
                        System.out.println("Toplam= " + (s1 + s2));
                        System.out.println("İşleme devam etmek istyordanız  1 e ,bir üst menü 2,çıkış yapmak için 3 e basınız.");
                        int x = scan.nextInt();
                        if (x == 1) {
                            continue outloop;
                        } else if (x == 2) {
                            continue outloop;


                        } else if (x == 3) {
                            System.out.println("Çıkış yapıyorsunuz:");
                            break outloop;

                        } else {
                            System.out.println("Hatalı giriş yaptınız.");

                        }


                    }
                case 2:
                    while (true) {
                        System.out.println("Lütfen bir sayi giriniz.");
                        int s1 = scan.nextInt();
                        System.out.println("Lütfen ikinci sayiyi giriniz.");
                        int s2 = scan.nextInt();
                        System.out.println("Çıkan Sonuc= " + (s1 - s2));
                        System.out.println("İşleme devam etmek istyordanız  1 e ,bir üst menü 2,çıkış yapmak için 3 e basınız.");
                        int x = scan.nextInt();
                        if (x == 1) {
                            continue;
                        } else if (x == 2) {
                            continue outloop;


                        } else if (x == 3) {
                            System.out.println("Çıkış yapıyorsunuz:");
                            break outloop;

                        } else {
                            System.out.println("Hatalı giriş yaptınız.");

                        }

                    }
                case 3:
                    while (true) {
                        System.out.println("Lütfen bir sayi giriniz.");
                        int s1 = scan.nextInt();
                        System.out.println("Lütfen ikinci sayiyi giriniz.");
                        int s2 = scan.nextInt();
                        System.out.println("Çarpma= " + (s1 * s2));
                        System.out.println("İşleme devam etmek istyordanız  1 e ,bir üst menü 2,çıkış yapmak için 3 e basınız.");
                        int x = scan.nextInt();
                        if (x == 1) {
                            continue;
                        } else if (x == 2) {
                            continue outloop;


                        } else if (x == 3) {
                            System.out.println("Çıkış yapıyorsunuz:");
                            break outloop;

                        } else {
                            System.out.println("Hatalı giriş yaptınız.");

                        }
                    }
                case 4:
                   bolme: while (true) {
                        System.out.println("Lütfen bir sayi giriniz.");
                        int s1 = scan.nextInt();
                        System.out.println("Lütfen ikinci sayiyi giriniz.");
                        int s2 = scan.nextInt();
                        System.out.println("Bçlme= " + (s1 / s2));
                        while (true){
                            System.out.println("İşleme devam etmek istyordanız  1 e ,bir üst menü 2,çıkış yapmak için 3 e basınız.");
                            int x = scan.nextInt();
                            if (x == 1) {
                                continue bolme;
                            } else if (x == 2) {
                                continue outloop;


                            } else if (x == 3) {
                                System.out.println("Çıkış yapıyorsunuz:");
                                break outloop;

                            } else {
                                System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz:");


                            }

                        }

                    }
                case 5:
                    System.out.println("Çıkış yapıyorsunuz:");
                    break outloop;

        */


        ////   Banka menüsü oluşturun 1 para ekle 2 hesabımı gör 3 para çek 4 çıkış  (money=2000)
        //        //  while işleme devam etmek için 1 e basın bir üst menü için 2 basın kart iade 3
        Scanner scan = new Scanner(System.in);
        int money = 2000;
        boolean flag = true;
        outloop:
        while (flag) {
            System.out.println("Lütfen Yapmak iatediğiniz işlemi seçiniz: \n 1. Para ekleme \n 2.Hesabımı gör " +
                    "\n 3.Para Çekme(En sevdiğimiz) \n 4. Çıkış");
            int islm = scan.nextInt();
            switch (islm) {
                case 1:
                    innerloop:
                    while (flag) {
                        if (islm == 1) ;
                        System.out.println("Lütfen eklemek istediğiniz Parayı giriniz:");
                        int ekl = scan.nextInt();
                        int paraSon = money + ekl;
                        System.out.println("Son bakiyeniz = "+ paraSon);
                        System.out.println("Lütfen işleme devam etmek istiyor iseniz 1(Bir)'e basınız:\n  Bir üst menüye " +
                                "dönmek için 2(iki)'ye Basınız:\n Kartın iadesi 3 e basınız: ");
                        int tus = scan.nextInt();
                        if (tus == 1) {
                            System.out.println("Paranız Yükleniyor Bekleyiiniz....\n Paranız Yüklendi.\n Bakiyeniz= " + paraSon);
                            System.out.println("Yeni bir para yükleme işlemi için Bekleyiniz");
                            continue innerloop;


                        } else if (tus == 2) {
                            System.out.println("Bir üst menüye dödürüleceksiniz: Lütfen bekleyiniz:");
                            continue outloop;


                        } else if (tus == 3) {
                            System.out.println("Kartınız iade Ediliyor.Bekleyiniz.");
                            break outloop;

                        } else {
                            System.out.println("Hatalı bir giriş Yaptınız.");
                            break outloop;
                        }


                    }
                case 2:
                    summerloop:
                    while (flag) {
                        System.out.println("Bakiyeniz şuanda =" + money);
                        System.out.println("Lütfen işleme devam etmek isterseniz: \n 1.Lütfen 1(Bir)'e basınız:\n 2. Bir üst menüye " +
                                "dönmek için 2(iki)'ye Basınız: Kartın iadesi 3 e basınız: ");
                        int tus = scan.nextInt();
                        if (tus == 1) {
                            System.out.println("Bakiyeniz şuanda =" + money);


                        } else if (tus == 2) {
                            System.out.println("Bir üst menüye dödürüleceksiniz: Lütfen bekleyiniz:");
                            continue outloop;


                        } else if (tus == 3) {
                            System.out.println("Kartınız iade Ediliyor.Bekleyiniz.");
                            break outloop;

                        } else {
                            System.out.println("Hatalı bir giriş Yaptınız.");
                            break outloop;
                        }


                    }
                case 3:
                    hummerloop:
                    while (flag) {
                        System.out.println("Lütfen Çekmek İstediğiniz Tutarı Giriniz:");
                        int cek = scan.nextInt();
                        if (cek > money) {
                            System.out.println("Yetersiz Bakiye");
                            continue hummerloop;
                        }
                        int paraSon = money - cek;
                        System.out.println("Son bakiyeniz = " + paraSon);
                        System.out.println("Lütfen işleme devam etmek isterseniz: \n 1.Lütfen 1(Bir)'e basınız:\n 2. Bir üst menüye " +
                                "dönmek için 2(iki)'ye Basınız: Kartın iadesi 3 e basınız: ");
                        int tus = scan.nextInt();
                        if (tus == 1) {
                            System.out.println("Bakiyeniz şuanda =" + money);


                        } else if (tus == 2) {
                            System.out.println("Bir üst menüye dödürüleceksiniz: Lütfen bekleyiniz:");
                            continue outloop;


                        } else if (tus == 3) {
                            System.out.println("Kartınız iade Ediliyor.Bekleyiniz.");
                            break outloop;

                        } else {
                            System.out.println("Hatalı bir giriş Yaptınız.");
                            break outloop;
                        }


                    }
                case 4:
                    while(flag){
                        System.out.println("Çıkış yapıyorsunuz");
                        flag=false;
                    }

            }

        }

    }

}










