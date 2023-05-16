package day_21_Class_And_Object;

public class Person {
    // isim Cinsiyet ve yaşı
    // Uyu() oyna()

    String isim; //nuıll               //Clasllar bir taslaktır.
    String cinsiyet; //null           // BUrada ayzılan değerler defaulttur.Yani boştur
                                      // Obje oluşturulurken değerlerin içi dolacaktır.
    int yas;   //0
    String tcNo;  //null


    public void uyu() {
        System.out.println(isim + " Uyuyor.");

    }

    public void oyunOyna() {
        System.out.println(isim + " Oyun oynuyor.");
    }

    public void tumBilgileriGetir() {
        System.out.println("isim" + isim);
        System.out.println("yas = " + yas);
        System.out.println("cinsiyet = " + cinsiyet);
    }
}
