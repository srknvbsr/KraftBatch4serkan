package day_19Custommethods_Return_Ders_tekrarı;

public class C03_Faktoriyel {
    public static void main(String[] args) {
        System.out.println("factoriyel(7) = " + factoriyel(7));

    }
    public static int factoriyel(int number){
        int fak = 1;
        for (int i = 1; i <=number ; i++) {
            fak = i*fak;
            }
        return fak;


    }


    // verdigimiz bir sayinin faktoryelini hesaplayip
    // sonucu bize donduren bir method olusturun
    /* Method olusturma asamalari
    1.public static (standart)
    2.olusturacagimiz metod bize bir sonuc dondurecekse data tipini belirtmek gerekiyor
    3.metod adi
    4.metodun parantezi() parametre olup olmayacagi ve parametre data tipleri ve isimleri parantez icerisine yazilir
    5 {} bodu ac, dondurulmesi islemi yap,
    6.return keywordu ile dondurulmesi planlanan degeri dondur
     */

}
