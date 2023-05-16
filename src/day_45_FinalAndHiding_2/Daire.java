package day_45_FinalAndHiding_2;

public class Daire extends Sekiller{
    double yariCap;
    double r=yariCap;

    @Override
    public double alanHesapla() {

        return Math.PI*r*r;
    }
}
