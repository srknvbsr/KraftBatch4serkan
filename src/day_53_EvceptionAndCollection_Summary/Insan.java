package day_53_EvceptionAndCollection_Summary;

public class Insan implements Baba,Ogretmen{


    @Override
    public void ogutVer() {
        System.out.println("Adam ol");
    }

    @Override
    public void harclikVer() {
        System.out.println("Harçlık verildi");
    }

    @Override
    public void ogret() {

    }

    @Override
    public void sinavYap() {
        System.out.println("Arada Quiz Yapar.");

    }

    public void yemekYe(){
        System.out.println("Yemek yiyor");

    }
    public void uyu(){
        System.out.println("uyuyor");
    }


}
