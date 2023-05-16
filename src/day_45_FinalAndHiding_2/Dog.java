package day_45_FinalAndHiding_2;

public class  Dog extends Animal {

    public Dog(int x) {
        super(x);
    }

    @Override
    public   void konus() {
        System.out.println(x);
        hareketEt();
        System.out.println("Hav hav");
    }

    @Override
    public void hareketEt() {
        System.out.println("kuyruk sallıypr");
    }
}
