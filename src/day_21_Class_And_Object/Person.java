package day_21_Class_And_Object;

public class Person {
    // isim Cinsiyet ve yaşı
    // Uyu() oyna()
    String isim;
    String cnsiyet;
    int yas;
    String tcNo;


    public void uyu() {
        System.out.println(isim + " Uyuyor.");

    }

    public void oyunOyna() {
        System.out.println(isim + " Oyun oynuyor.");
    }

    public void tumBilgileriGetir() {
        System.out.println("isim" + isim);
        System.out.println("yas = " + yas);
        System.out.println("yas = " + yas);
    }
}
