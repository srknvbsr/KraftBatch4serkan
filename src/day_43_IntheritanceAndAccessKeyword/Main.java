package day_43_IntheritanceAndAccessKeyword;

public class Main {
    public static void main(String[] args) {

        Parent harun = new Parent();

        Child aslan = new Child("harun");
        System.out.println(aslan.parentName);
        System.out.println(Parent.x);
        Parent.staticMethod();
        Child.staticMethod();
        System.out.println(Child.x);
        System.out.println("------------------------------------------");
        Vehicle vehicle = new Vehicle();
        Automobile automobile = new Automobile();
        MotorCycle motorCycle = new MotorCycle();
        vehicle.start();
        motorCycle.start();

        Sekiller sekiller = new Sekiller();
        sekiller.alanHesapla();
        Daire daire = new Daire();
        daire.yariCap = 2;
        System.out.println(daire.alanHesapla());


        Kare kare = new Kare();
        kare.kenarUzunlugu = 5;
        System.out.println(kare.alanHesapla());

        MotorCycle motorCycle1 = MotorCycle.motorsikletOlustur();


    }


}
