package day08_ScannerAndOperation;

public class CO3_AritmeticOperators {
    public static void main(String[] args) {
        System.out.println("90"+10);//9110 concatenation
        System.out.println(10+"20");//concatenation
        System.out.println("90"+10+10);//concatenation
        System.out.println("90"+(10+10));//concatenation
        System.out.println(10+"90"+30);//concatenation
        System.out.println(""+10+30+"90");//concatenation
        System.out.println(10+20);// 30 Addition
        System.out.println(100-20);// 80 subraction
        System.out.println("*******************************************************");
        //*********************************
        System.out.println(100/3);// 33
        System.out.println(10/4.0);
        System.out.println(10d/4.0);
        //**********************************
        System.out.println("*******************************************************");

        int a = 100;
        double b= a/6;
        //önce 100 ü 6 ya bölerek int ifade olur oda 16 sonra 16 yı double çevirir.
        System.out.println("*******************************************************");


        System.out.println(b);
        double d = (double)a/6;
        System.out.println(d);
        System.out.println(10%2);
        System.out.println(10%3);
        System.out.println(10%4);




    }
}
