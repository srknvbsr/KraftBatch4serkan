package day_43_IntheritanceAndAccessKeyword;

public class Kare extends Sekiller {

    @Override
    public int alanHesapla() {
        return super.kenarUzunlugu*kenarUzunlugu;
    }//super burada kullanılsada olur kullanılmasada olur.
    //çünki biz burada bunları miras aldık.
}
