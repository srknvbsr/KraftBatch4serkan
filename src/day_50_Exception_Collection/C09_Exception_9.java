package day_50_Exception_Collection;

public class C09_Exception_9 {
    public static void main(String[] args) {




    }


    void g() {
        f();
        b();
        d();
    }


    static void f() {
        System.out.println("Ben doktorum temizledim");
        d();
        try {
            a();//virüslü
        } catch (Exception e) {

        }

        b();
    }


    static void d() {
        try {
            c();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    static void c() throws Exception {
        d();
        a();
    }


    static void a() throws Exception {//Birinci şekil kullnımı
        b();
        throw new Exception("Harun hata fırlat");

    }

    static void b() {//İkinci şekil kullanımı
        try {
            throw new Exception("Serkan hata fırlattı");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
