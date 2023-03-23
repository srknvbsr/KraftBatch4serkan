package day09_OperatorConnecting;

public class C04shortAndOperator {
    public static void main(String[] args) {
        //assayment
        int number = 10;
        number = 20;
        System.out.println(number);
        String word = "Java Programing language";
        System.out.println("word = " + word);
        word = "phyton programing language";
        System.out.println("word = " + word);
        System.out.println("****************************************************");
        int x = 100;
        System.out.println(x);

        x += 100;   //x=x+100;(Aynısı)
        System.out.println(x);
        System.out.println("*******************************************************");
        String str = "Golden";
        str += "Globe"; //str=str+" Globe";
        System.out.println(str);
        System.out.println("********************************************************");
        double num = 3.5;
        System.out.println(num);
        num += 6.5;
        System.out.println(num);
        System.out.println("********************************************************");
        double bakiye = 3520.50;
        System.out.println(bakiye);
        bakiye += 1500;//yatırılan bakiye
        System.out.println(bakiye);
        bakiye -= 2200;//çekilen bakiye
        System.out.println(bakiye);
        System.out.println("********************************************************");
        double maas = 42500.50;
        System.out.println("maas= " + maas);
        maas *= 2;
        System.out.println("maas = " + maas);
        double gramAltin = 0.001;
        gramAltin *= 120;
        System.out.println("gramAltin = " + gramAltin);
        System.out.println("********************************************************");
        double num2 = 50000.0;
        num2 /= 2;
        System.out.println("num2 = " + num2);
        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);
        System.out.println("************************************************************");
        int odenecekTutar = 1130;
        System.out.println("odenecekTutar = " + odenecekTutar);
        int ikiYuzluk = 1130 / 200;
        odenecekTutar %= 200;
        System.out.println("odenecekTutar = " + odenecekTutar);
        int yuzluk = odenecekTutar / 100;
        odenecekTutar %= 100;
        int yirmilik = odenecekTutar / 20;
        odenecekTutar %= 20;
        int onluk = odenecekTutar / 10;
        odenecekTutar %= 10;
        System.out.println("1130 TL için " + ikiYuzluk + " tane ıkıyuzluk banknot"
                + yuzluk + " yuzluk banknot " + yirmilik +
                " tam yirmilik banknotödemeniz gerekmektedir.");


    }
}
