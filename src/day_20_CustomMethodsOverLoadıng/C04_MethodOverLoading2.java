package day_20_CustomMethodsOverLoadıng;

public class C04_MethodOverLoading2 {
    public static void main(String[] args) {
        calculateArea(3,5);
       calculateArea(4,4);
       caculateArea(3);

    }
/*CalculateArea isminde  method yazın ve overload
    olsun. Birincisi kare-dikdörtgen alanını hesaplasın.
    İkincisi dairenin alanını hesaplasın. PI: 3,14

 */
   // public static void calculateArea(int a,int b){
   //     return=a*b;
    //cannot overload with return type.

   public static void calculateArea(int a,int b) {
       System.out.println(a * b);
   }
    public static void caculateArea(int radius){
        System.out.println(Math.round(Math.PI*radius*radius));
    }
}
