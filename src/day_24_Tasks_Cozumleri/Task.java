package day_24_Tasks_Cozumleri;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       serkan: while (true) {
            boolean message1;
            System.out.println("Lütfen çocuk bayramı ile alakalı bir mesaj veriniz: ");
            String message = scan.nextLine();
           message1=message.contains("sev");

            if (message1==true) {
                System.out.println(message());
                break ;
            } else {
                System.out.println("sev" + " kökü olan bir mesaj giriniz.");
                System.out.println();
                continue serkan;
            }

        }
    }
    public static String message(){
        return "what a lovely person (ne hoş bir insan)";
    }
}
