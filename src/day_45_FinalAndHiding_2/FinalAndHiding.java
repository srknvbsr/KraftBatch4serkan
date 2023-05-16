package day_45_FinalAndHiding_2;

public class FinalAndHiding {
    /*static int x=5;


    FinalAndHiding(){
        System.out.println("constructor çaloıştı");
    }
    static {
        System.out.println("static blşock çalıştı");
    }

     */
   final void metot(){
        System.out.println("ben parent " +
                "classın metdoyum değiştirilmem gerekir.");
    }
    final void metot(int x){
        System.out.println("ben parent " +
                "classın metdoyum değiştirilmem gerekir.");
    }
    String bankaAdi="Akbank";
   public void getBankaAdi(){
       System.out.println("Bankanızın ADı:"
               + this.bankaAdi);
   }

}
