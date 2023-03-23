package day09_OperatorConnecting.day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C07_ParolayıTahminEt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String parola = "Serkan";
        String tahmin = " ";
        int hak = 3;
        System.out.println("Lütfen parolayı giriniz. Ancak Tahmin hakkınız 3 adettir.");
        while (0<hak){
            System.out.println("Lütfen paraloyı tahmmin ediniz");
            tahmin=scan.nextLine();

        if(tahmin.equals(parola)){
                System.out.println("Tebrikler bildiniz");
                break;

            }else {
                System.out.println("Parolayı bilemediniz tahmininiz doğru değildir. Kalan hakkınız: = "+(--hak));

                }

            }
        if((hak == 0)){
            System.out.println("Lütfen başka sefere bir daha deneyiniz");



        }
    }
}
