package day_41_StaticAndInteritance;


public class C01_Consructor {
    public static void main(String[] args) {
        //Integer sayi=new Integer();
        Car car = new Car("Honda", 1996, 120, "serkan123", true, true);
        Car car1 = new Car("MErcedes", 1996, 120, "serkan123", true, true);
        Car car2 = new Car("Audi", 1996, 120, "serkan123", true, true);
        Car car3 = new Car("tofaş", 1996, 120, "serkan123", true, true);
        System.out.println("car.marka = " + car.marka);
        //car.saseNo = "harun123456"; bu şekilde saseNo kırmızı yanar çünki private yazpyık
        // clastaki değeri.
        //car.setSaseNo("Mehmet123");
        //System.out.println(car.getSaseNo());
        car.setBeygir(150);
        car.getBeygir();
        //System.out.println(car.tekerlekSayisi = 5);
        Car.tekerlekSayisi=100;
        System.out.println(car3.tekerlekSayisi);
    }
}
