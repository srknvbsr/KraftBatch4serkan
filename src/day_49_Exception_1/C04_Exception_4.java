package day_49_Exception_1;

public class C04_Exception_4 {
    public static void a() throws InterruptedException {
d();
    }

    public static void b() {
      // c(); cyi çağırdığı zaman hata almaz.
        // d(); ancak d yi çağırıken hata alır.

    }

    public static void c() {
        try {
            d();
        }catch (Exception e){
            System.out.println();
        }
    }

    public static void d() throws InterruptedException {
        Thread.sleep(3000);
    }


}
