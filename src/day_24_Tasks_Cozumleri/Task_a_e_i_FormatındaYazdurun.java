package day_24_Tasks_Cozumleri;

import java.util.Scanner;

public class Task_a_e_i_FormatındaYazdurun {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        String str1;
        String str2;
        String str3;
        System.out.println("Lüften bir mesaj giriniz:");
        String message = scan.nextLine();
        str1 = message.substring(1, 2);
        str2 = message.substring(4, 5);
        str3 = message.substring(6, 7);
        System.out.println(str1 + "," + str2 + "," + str3);
        */
        System.out.println(sesliHarfBul("Merhaba"));


    }

    public static String sesliHarfBul(String str) {
        String message="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'ı' ||str.charAt(i) == i
                    || str.charAt(i) == 'o' || str.charAt(i) == 'ö' || str.charAt(i) == 'u' || str.charAt(i) == 'ü') {
               message+=str.charAt(i);
            }

        }
        return message;



    }

}
