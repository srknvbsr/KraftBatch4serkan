package day_58_abstractionRewiev;

import day_58_abstractionRewiev.AbstractionRewiev.Car;
import day_58_abstractionRewiev.AbstractionRewiev.Tofas;

import java.util.ArrayList;
import java.util.List;

public class C03_ExceptionsRewiev {
    public static void main(String[] args) {
        List<Car> MyGarage=new ArrayList<>();
        while(true){
            MyGarage.add(new Tofas());
        }
        //OutOfMemoryError handle edilemez.
    }
}
