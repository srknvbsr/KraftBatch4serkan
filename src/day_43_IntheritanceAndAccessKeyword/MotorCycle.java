package day_43_IntheritanceAndAccessKeyword;

public class MotorCycle extends Vehicle {
    private int cc;

    public MotorCycle() {

    }

    public MotorCycle(int cc) {
        this.cc = cc;

    }

    public void start() {
        System.out.println("Motor çalıştı");
    }

    public static MotorCycle motorsikletOlustur() {
        MotorCycle motorCycle = new MotorCycle();
        return motorCycle;

    }

    public void changeCc(int yeniCc) {
        cc = yeniCc;


    }

    public int getCc() {
        return cc;
    }


}
