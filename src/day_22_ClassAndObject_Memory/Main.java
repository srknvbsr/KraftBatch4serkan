package day_22_ClassAndObject_Memory;

public class Main{
    public static void main(String[] args) {
        Daire2 benimDairem=new Daire2();
        benimDairem.r=2;
        Daire2 seninDairen=new Daire2();
        seninDairen.r=5;
        System.out.println("benimDairem = " + benimDairem);
        System.out.println("seninDairen = " + seninDairen);


        CarNew car1=new CarNew();
        car1.marka="Honda";
        car1.modelAdi="City";
        car1.begir=136;

        CarNew car2=new CarNew();
        car2.marka="Meercedes";
        car2.modelAdi="e200d";
        car2.begir=185;
        if(car1.begir> car2.begir){
            System.out.println(car1.marka+" "+car1.modelAdi);
        }else {
            System.out.println(car2.marka+" "+car2.modelAdi);
        }


    }










}
// CAr adında bir clacc oluşturun
// fieldları marka
//modelAdı
//beygir
//farklı bir classta 2 adet obje tanımla ve bu 2 adet objenin beygirlerini
//karşılaştır ve hangisnin beygiri büyükse ekrana onun marka
// ve modelini yazın.

