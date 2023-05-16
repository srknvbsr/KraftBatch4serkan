package day_46_AbstractClassAndİnterface.car_1;

public class Togg extends Car{
    public Togg( String model, String color, int year, double price){
        super("Togg",model,color,year,price);
    }

    @Override
    public void start() {
        System.out.println("Say \"Star\" to start the engine");
    }

    public void xoom(){
        System.out.println("Zoom meeting is starting , smile to camera");
    }

}
