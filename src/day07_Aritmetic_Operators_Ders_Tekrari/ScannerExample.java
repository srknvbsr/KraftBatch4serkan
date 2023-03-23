package day07_Aritmetic_Operators_Ders_Tekrari;

import java.util.Scanner;


public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.print("Lütfen Bir Kelime giriniz:");
        String str = scan.nextLine();
        System.out.println(str);

         */
        //***************************************************************************
        /*System.out.println("Kimya_Notunuzu_Giriniz:");
        int kimya = scan.nextInt();
        System.out.println("Fizik_Notunuzu_Giriniz:");
        int fizik = scan.nextInt();
        System.out.println("Matematik_Notunuzu_Giriniz:");
        int matematik = scan.nextInt();
        int ortalama = (kimya + fizik + matematik) / 3;
        System.out.println("Ortalama notunuz"+ ortalama);

         */
        //********************************************************************************************

        //Ali fizik dersinden 92,
        // kimya dersinden 55,
        // matematik dersinden 89 almıştır.
        System.out.println("Lütfen Kimya DErsinin Notunu Giriniz:");
        int kimya=scan.nextInt();
        System.out.println("Lütfen Fizik DErsinin Notunu Giriniz:");
        int fizik=scan.nextInt();
        System.out.println("Lütfen Matematik DErsinin Notunu Giriniz:");
        int matematik=scan.nextInt();
        int notOrtalaması= (kimya+fizik+matematik)/3;
        System.out.println("notOrtalaması = " + notOrtalaması);




    }
}
