package day04_VariableCont;

public class NarrowingCasting {
    public static void main(String[] args) {
        double rate = 3.9;
        int num;
        num = (int) rate;// doublel tipindeki sayısını int tipine otomatik olarak atamadı bizde olaya müdahale ederek
        // int dönüşmesi için kendimiz yazdık.(manuel casting)
        System.out.println(num);


    }
}
