package day_50_Exception_Collection;

public class C03_Exception_7 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {

            System.out.println(i);

        }


    }

    void d() {
        c();
    }


    void c() {
        try {
            b();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void b() throws InterruptedException {
        a();
    }

    void a() throws InterruptedException {
        Thread.sleep(1000);

    }


}
