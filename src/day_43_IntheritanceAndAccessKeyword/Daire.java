package day_43_IntheritanceAndAccessKeyword;

public class Daire extends Sekiller{
    public int degisken;


    @Override
    public int alanHesapla() {
        return (int)(super.pi*yariCap*yariCap);
    }//super burada kullanılsada olur kullanılmasada olur.
    //çünki biz burada bunları miras aldık.
}
