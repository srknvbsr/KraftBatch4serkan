package day_39_ConstructorOverloadıng;

public class Car {
    String marka;

    String model;

    String renk;

    int hiz;

    boolean otomatikMi;


    public Car() {

    }

    public Car(String marka) {
        this.marka = marka;
        //Parametre ismi intance variable ile aynı değilse diirek atama yapmak lazım.
        // örmek marka=brand gibi

    }

    public Car(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Car(String marka, String model, String renk) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;

    }

    public Car(String marka, String model, String renk, int hiz) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.hiz = hiz;

    }
    public Car(String marka, String model, String renk, int hiz,boolean otomatikMi) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.hiz = hiz;
        this.otomatikMi=otomatikMi;

    }
    public String toString(){
        return "Car{"+
                "marka='"+marka+
                "model='"+model+
                "renk='"+renk+
                "hız='"+hiz+
                "otomatik mi='"+otomatikMi+"'}";
    }

    public static Car reknSec(Car car,String renk){
        car.renk=renk;
        return car;
    }



}
