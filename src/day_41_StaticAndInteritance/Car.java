package day_41_StaticAndInteritance;

import java.util.Scanner;

public class Car {
    String marka;
    int Modelyili;
    private int beygir;
    private String saseNo;
    boolean isSuv;
    boolean isManual;
    private final String sifre = "serkan";
    static int tekerlekSayisi=4;


    public String getSaseNo() {
        return this.saseNo;
    }

    //dışarıdan şifre girilmeden saseNo değişimin Olamayacağı bir örnek
    public void setSaseNo(String yenisaseNo) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir şifre girniz:");
        String sifre = scan.nextLine();
        if (sifre.equals(this.sifre)) {
            saseNo = yenisaseNo;
            System.out.println("tebrikler başarılı");
        } else {
            System.out.println("işlem başarısız:" +
                    "Yeni şase no girilemedi.");
        }
    }

    public int getBeygir() {
        System.out.println("girilen beygir değeri " + this.beygir + " dir.");
        return this.beygir;
    }

    public void setBeygir(int beygir) {
        if(beygir<100&&isSuv){
            System.out.println("Bçyle bir suv aracı olamaz");
            return;
        }
        this.beygir=beygir;
    }

    public Car() {
        System.out.println("Merhaba objeniz başarılı bir şekilde oluşturuldu.");

    }

    public Car(String marka) {
        this();
        this.marka = marka;

    }

    public Car(String marka, int Modelyili) {
        this(marka);
        this.Modelyili = Modelyili;

    }

    public Car(String marka, int Modelyili, int beygir) {
        this(marka, Modelyili);
        this.beygir = beygir;


    }

    public Car(String marka, int Modelyili, int beygir, String saseNo) {
        this(marka, Modelyili, beygir);
        this.saseNo = saseNo;

    }

    public Car(String marka, int Modelyili, int beygir, String saseNo, boolean isSuv) {
        this(marka, Modelyili, beygir, saseNo);
        this.isSuv = isSuv;
    }

    public Car(String marka, int Modelyili, int beygir, String saseNo, boolean isSuv, boolean isManual) {
        this(marka, Modelyili, beygir, saseNo, isSuv);
        this.isManual = isManual;
    }


    public void hizlan() {
        System.out.println("Araç hızlanıyor");
    }

    public String beygirKarsilastir() {
        if (beygir > 100) {
            return "Güçlü Araç";
        }
        return "Zayıf Araç";
    }


}


