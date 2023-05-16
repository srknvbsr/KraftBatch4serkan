package day_43_IntheritanceAndAccessKeyword;

import java.util.Scanner;

public class Banka {
    String bankName;
    String genelMerkezAdresi;
    String getGenelMerkez;
    private int subeSayisi = 5;


    public Banka() {

    }
    public Banka(String bankName,String genelMerkezAdresi,String genelMerkez) {

    }

    public int getSubeSayisi() {
        return subeSayisi;
    }

    public void setSubeSayisi(int subeSayisi) {
        this.subeSayisi = subeSayisi;
    }

    public static void karsilama() {
        System.out.println("Bankamıza HoşGeldiniz");
    }

    public static void BankAccountMenu() {
        Scanner scan = new Scanner(System.in);
        double hesaptakiPara = 1000;

        while (true) {
            System.out.println("Seçmek istediğiniz Banka menüsü");
            System.out.println("1. Hesap Bilgilerini Görüntüle");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Para Çekme");
            System.out.println("4. Hesap Kapatma");
            System.out.println("5. Çıkış");
            System.out.println("Lütfen yapmak istediğiniz menüyü seçiniz");
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Hesap Bilgileri");
                    System.out.println("Bakiye= " + hesaptakiPara);
                    break;
                case 2:
                    System.out.println("Yatırmak istediğiniz Miktarı Giriniz");
                    double yatirilacakMiktar = scan.nextDouble();
                    hesaptakiPara += yatirilacakMiktar;
                    System.out.println("Yeni bakiye= " + hesaptakiPara);
                    break;
                case 3:
                    System.out.println("Çekmek istediğiniz Miktarı Giriniz");
                    double cekilecekTutar = scan.nextDouble();
                    if (cekilecekTutar > hesaptakiPara) {
                        System.out.println("Yetersiz Bakiye");

                    } else {
                        hesaptakiPara -= cekilecekTutar;
                        System.out.println("Yeni bakiye= " + hesaptakiPara);
                        break;

                    }
                case 4:
                    System.out.println("Hesabınız kapatılıyor");

                    break;
                case 5:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Hata: Geçersiz işlem numarası.");
                    break;

            }


        }


    }


}
