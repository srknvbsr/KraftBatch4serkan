package day_41_StaticAndInteritance;

import java.util.Random;

public class BankaMusteri {
    private String adSoyad;
    private String hesapNo;
    private double bakiye;
    private static int count = 1;//statik olması her objeden sonra değişsin diye.Private dışarıdan ukaşmasını istemiyorum
private final static String SİFRE="Serkan";

    {
        this.hesapNo = hesapNoOlustur();
    }

    public BankaMusteri() {
        // this.hesapNo = hesapNoOlustur();

    }
    public BankaMusteri(String adSoyad) {
        this.adSoyad = adSoyad;
        // this.hesapNo = hesapNoOlustur();

    }

    public BankaMusteri(int bakiye) {
        this.bakiye = bakiye;
        // this.hesapNo = hesapNoOlustur();
    }


    public BankaMusteri(String adSoyad, double bakiye) {
        this(adSoyad);
        this.bakiye = bakiye;


    }
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getHesapNo() {

        return hesapNo;
    }
    public void setHesapNo(String hesapNo,String sifre){
        if(sifre.equals(this.SİFRE)){
            this.hesapNo=hesapNo;
        }
    }

    public double getBakiye() {
        return bakiye;
    }

    public void paraEkle(double para) {
        // this.bakiye=this.bakiye+para;
        this.bakiye += para;
    }

    public void paraCek(double para) {
        if (this.bakiye > para) {
            this.bakiye -= para;
        }

    }





    private static String hesapNoOlustur() {
        Random random = new Random();
        int x = random.nextInt(8999) + 1000;//1000 ile a9999 arası değer verir.
        String hesapNo = count + "" + 2023 + x;
        count++;
        return hesapNo;
    }


}
