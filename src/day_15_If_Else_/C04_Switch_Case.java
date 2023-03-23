package day_15_If_Else_;

import java.util.Scanner;

public class C04_Switch_Case {
    public static void main(String[] args) {
       /* int x = 2;
        switch (x) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            default:

        }

        */
        //Et menüsü
        //Sebze Menüsü
        //Çocuk Menü
        //Et mennüsü: imambayıldı,pirzola,tavuk
        //sebze Menüsü:Enginar ve roka salatası
        //Çocuk Menüsü : Pataes kızartması,makarna(5)
        Scanner scan = new Scanner(System.in);
        System.out.println("Et menü,sebze menü,çocuk menü (1-2-3");
        int tercih_1 = scan.nextInt();
        switch (tercih_1) {
            case 1:
                System.out.println("Pitzolam mı(1) yoksa Tavuk mu (2)");
                int terciih_2 = scan.nextInt();
                switch (terciih_2) {
                    case 1:
                        System.out.println("Pü+irzola 50 tldir.");
                        break;
                    case 2:
                        System.out.println("Tavuk 30 tldir.");
                        break;
                    default:
                        System.out.println("Hatalı giris");
                }case 2:
                System.out.println("Enginar mı(1 yoksa Roka salatası mı(2)");
                int tercih_3 = scan.nextInt();
                switch (tercih_3){
                    case 1:
                        System.out.println("enginar yemeği");
                }

        }

    }
}
