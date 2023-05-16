package day_46_AbstractClassAndİnterface.car_1;

public final class  Honda extends Car {

    public Honda(String model, String color, int year, double price){
        super("Honda",model,color,year,price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to start");
    }
    public void stop(){
        System.out.println("" +
                "VTEC engine needs a perfect braking system");
    }



}
