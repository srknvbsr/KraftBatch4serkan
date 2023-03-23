package day09_OperatorConnecting;
import java.util.Scanner;


public class C03SayininRakamlariToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 3 basamaklı pozitif bir sayi giriniz: ");
        int number = scan.nextInt();

        int lastDigit = number%10;

        int totalofDigits = lastDigit;
        number= number/10;

        lastDigit = number%10;

        totalofDigits =  totalofDigits+lastDigit;

        number=number/10;

        lastDigit = number%10;
        
        totalofDigits = totalofDigits + lastDigit;
        System.out.println("Girilen sayinin rakamlar toplami: "+totalofDigits);

        

        
    }
}
