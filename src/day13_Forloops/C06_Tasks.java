package day13_Forloops;

public class C06_Tasks {
    public static void main(String[] args) {
        /*for(int i =0; i<=100;i++)
            System.out.print(i+" ");
        System.out.println("****************************************************************");
        for(int i =15; i<=100;i++)
            System.out.print(i+ " ");
        System.out.println("****************************************************************");
        for(int i =100; i>=0;i--)
            System.out.print(i+ " ");
        for(int i =0; i<=100;i+=2){
            System.out.print(i+" ");

         */
        for (int i = 0; i <= 100; i += 2)
            System.out.print(i + " ");
        System.out.println("****************************************************************");

        for (int i = 1; i <= 100; i += 2)
            System.out.print(i + " ");
        System.out.println("****************************************************************");
        for (int i = 1; i <=20; i++) {
            System.out.println(i + " " + Math.pow(i, 3));
        }
        System.out.println("****************************************************************");
        for ( int i = 23; i<=50;i++){
            double sonuc=(i*1.8)+32;
            System.out.println("sonuc = " + sonuc);
        }
        System.out.println("****************************************************************");
        for(char ch = 'a';ch <='z';ch++){
            System.out.print(ch+" ");
        }
        System.out.println("****************************************************************");
        for(char ch = 'A';ch <='Z';ch++){
            System.out.print(ch+" ");

    }
        System.out.println("****************************************************************");
        for (int i = 1; i <=9; i++) {
            int j = 9;
            int carp=i*j;
            System.out.println("carp = " + carp);
        }


}
}
