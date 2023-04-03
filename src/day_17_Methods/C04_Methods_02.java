package day_17_Methods;

public class C04_Methods_02 {
    public static void main(String[] args) {
        ortalama();
        enBuyuk();
        kg_Turn_okka();
        kupAlma(4);
        int sayi=5;
        kareAlma(sayi);
        name("Serkan");
        max(35,25);
        average(15.2,2.5);

    }
    //Bir method yazın 3 sayının aritmetik ortalamasını versin
    public static void ortalama(){
        int x=10,y=15,z=25;
        double result = (x+y+z)/3;
        System.out.println(result);

    }
    //Bir
    //method yazın 2 sayıdan büyük olanı versin
    public static void enBuyuk(){
       int num1=15;
       int num2=45;
       int max=30;

       if(num2>max){
           System.out.println(num2+" En büyük sayıdır.");

       } else if (num1>max) {
           System.out.println(num1+" En büyük sayıdır.");

       }


    }
    //Bir
    //method yazın ve kiloyu okka cinsinden versin
    //Okka= 1 282 kg
    public static void kg_Turn_okka(){
        int x= 5;
        double okka= 1.282;
        double result = x/okka;
        System.out.println(x+ " kg "+ result +" okka'dır. ");

    }
    // Bir sayının küpünü alma parametre metodu yapınız.
    public static void kupAlma(int x ){
        double result=x*x*x;
        System.out.println(x+" ün küpü = "+result+"  dır. ");
    }
    //Sayının karesini yazan metodu yazınız
    public static void kareAlma(int x){
          int result=x*x;
        System.out.println(x+" ün karesi = "+result+"  dir. ");

    }
    //Parametre olarak isminizi alan sonucunda isminiiz yazan programı yazınız.
    public static void name(String name){
        String isim="Serkan ";
        System.out.println(isim);
    }
    public static void max(int x,int y){

       int max;
       if(x>y){

           max=x;
           System.out.println("En büyük sayi: = "+ max);

       }else if(y>x){
           max=y;
           System.out.println("En büyük sayi: = "+ max);

       }

    }
    public static void average(double x,double y){
        double average=x/y;
        System.out.println("İki sayının ortalaması = " +average);

    }
}
