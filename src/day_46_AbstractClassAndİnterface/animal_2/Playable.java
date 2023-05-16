package day_46_AbstractClassAndİnterface.animal_2;

public interface Playable {

    boolean isFriendly=true;//static and final by default

  public static void method1(){
        System.out.println("is Friendly");
    }

   void play();

    //public abstract.abstract metodlarda bodysiz
    // açılan metot interfacelerde bodyli açılabilir.
    //BUnun adına default method denir.

}
