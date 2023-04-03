package day_21_Class_And_Object_dersTEkrari;

public class C03_Fibanocci {
    //Kullanıcı tarafından girilen n terimli Fibonacci dizisini yazdıran bir program yazın: 0 1 1 2 3 5 8 13 24//
    //public static void fibonacci(){
    //  for(int i=0; i)
    public static void main(String[] args) {
   int sonsayi=(fibonacciSonsayi(10))*5;
        System.out.println("Son sayinin 5 ile çarpılmış hali ="+sonsayi);
    }
    public static int fibonacciSonsayi(int n){
        int x=0;
        int y=1;
        int z=0;
        //System.out.println(x+" ");
        //System.out.println(y+" ");
        for (int i = 0; i < n-2; i++) {
            z=x+y;
            x=y;
            y=z;


        }
        System.out.println(z+"=son sayıdır.");
        return z;
    }
}
