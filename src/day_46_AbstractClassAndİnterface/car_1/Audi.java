package day_46_AbstractClassAndİnterface.car_1;

public final class Audi extends Car{
    public Audi(String model, String color, int year, double price){
        super("Audi",model,color,year,price);
    }

    @Override
    public void start() {
        System.out.println("Press key to start the engine");

    }
    public void quatro(){
        System.out.println("Quatro feature is active");
    }




}
