package day_58_abstractionRewiev;

import day_58_abstractionRewiev.AbstractionRewiev.*;

public class C02_PolymorphismRewiev {
    public static void main(String[] args) {
        Car car1 =new Tofas();
        Car car2 = new BMW();
        Car car3 = new Togg();
       /* Autopilot autopilot= (Autopilot) new Tofas();
        System.out.println(autopilot);//ClassCastException

        */

        Autopilot autopilot=new BMW();
        autopilot.autoPark();

        Car electricCar=new Togg();
        electricCar.driver();
        electricCar.star();
        electricCar.stop();
        ((Togg)electricCar).autoPark();





    }
}
