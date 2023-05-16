package day_45_FinalAndHiding_2;

public class Fish extends Animal{
public Fish(){

    super(5);
}

    @Override
    public void konus() {
        System.out.println("cik cik");
    }

    @Override
    public void hareketEt() {
        System.out.println("kuyruk sallıypr");
    }
}
