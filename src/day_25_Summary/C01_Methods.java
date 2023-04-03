package day_25_Summary;

public class C01_Methods {
    public static void main(String[] args) {
       int x=10,y=5;
        //System.out.println("x+y = " + (x + y));
        //System.out.println(ornekMethods(10, 15));
       // System.out.println(max(5, 7));
        //max değerin Toplamlarının 4 katı mı diye kontrol et.
        boolean b = 4 * max(5, 7) == sum(5, 7);
        //System.out.println("b = " + b);
        String str1=ucEkle("Serkan");
        System.out.println(str1);


    }
    public static int ornekMethods(int x,int y){
        return x+y;

    }
    public static int max(int a,int b){
        if(a>b){
            return a;

        }
        return b;
    }
    public static int sum( int x,int y){
        return x+y;

    }public static String ucEkle(String str){
        return str+"3";


    }

        


}
