package day04_VariableCont;

public class Currencies {
    public static void main(String[] args) {
        //$1000 2023 kurları exchange rates
        int dolar = 1000;
        double tl = dolar * 18.89;
        double euro = dolar * 0.94;
        double JPY = dolar * 136;
        double pound = dolar * 0.83;
        double CAD = dolar * 1.36;
        double yuan = dolar*6.9;
        System.out.println(tl);
        System.out.println(euro);
        System.out.println(JPY);
        System.out.println("pound = " + pound);
        System.out.println("CAD = " + CAD);
        System.out.println("yuan = " + yuan);


    }
}
