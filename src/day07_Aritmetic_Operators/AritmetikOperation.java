package day07_Aritmetic_Operators;

public class AritmetikOperation {
    public static void main(String[] args) {

        //int z = x+y;
        //int z = x-y;
        //int z = x*y;
        // double z = (double)x/y;//x i genişletme işlemi yaparsak çalışır bu sefer.
        // double z = x/(double)y;
        //double z = (double)(x/y);işe yaramaz.

        // System.out.println(z);
        //System.out.println("harun"+x*y);
        //System.out.println("harun"+x*y);
        //System.out.println("harun"+5+2);
        // int x = 5;
        //int y = 2;
        // double z = 4.0;
        //double t = (x/y)/z;
        //double t = ((double) x/y)/z;//bir tane double ifade olması oranın double olması için yeterliidir.
        //System.out.println(t);
        // int t = x % y;
        // System.out.println(t);
        //int sayi = 3+5/2*4%(12-9);
        //3+5/2*4%3
        //3+2*4%3
        //3+8%3
        //3+2
        //5 sonuç.
        // System.out.println(sayi);
        int sayi = (int)(3+(double)5/2*4%(12-9));

        System.out.println(sayi);

    }
}
