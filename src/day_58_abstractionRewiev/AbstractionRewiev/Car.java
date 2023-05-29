package day_58_abstractionRewiev.AbstractionRewiev;

public abstract class Car {
    public String brand, model, color;

    /* public final void driver() {
         System.out.println("I am driving a " + color + " " + brand + " " + model);
     }

     */
    public abstract void driver();

    public abstract void star();


    public abstract void stop();


}
