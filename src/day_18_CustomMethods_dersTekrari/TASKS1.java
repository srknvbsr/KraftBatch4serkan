package day_18_CustomMethods_dersTekrari;

import java.sql.PreparedStatement;

public class TASKS1 {
    public static void main(String[] args) {
        birthday(2023, 1985);
        usBulma(2, 4);
        sayiBulma(6, 5);
        islem(10, 12, "*");
        theLastOfDigit(10,55);

    }

    /**
     * Bir
     * method yazın doğum yılınızı girdiğinizde yaşınızı
     * versin
     */
    public static void birthday(int year, int birthday) {
        int age = year - birthday;
        System.out.println("Your age is =" + age);

    }

    /**
     * Bir
     * method yazın 2 sayı kabul etsin ve ilk sayıyı ikinci
     * sayının üslü kuvveti yapıp sonuç versin
     *
     * @param taban
     * @param kuvvet
     */
    public static void usBulma(int taban, int kuvvet) {
        double result = Math.pow(taban, kuvvet);
        System.out.println(result);

    }

    /**
     * @param sayi1
     * @param sayi2
     */

    public static void sayiBulma(int sayi1, int sayi2) {

        int result = sayi1 + sayi2;
        System.out.println(sayi1 + "+" + sayi2 + "=" + result);
    }

    /* /**
     * Bir
     * method yazın 3 parametre li olsun ilk ikisi işleme sokulacak
     * sayıları üçüncü ise yapılacak işlemi belirlesin Sonucu versin
     * @param number1
     * @param number2
     * @param result
     */
    public static void islem(int number1, int number2, String operation) {
        if (operation.equals("+")) {
            System.out.println(number1 + number2);

        } else if (operation.equals("-")) {
            System.out.println(number1 - number2);
        } else if (operation.equals("*")) {
            System.out.println(number1 * number2);
        } else if (operation.equals("/")) {
            System.out.println(number1 / number2);
        } else {
            System.out.println("Hatalı işlem yaptınız.");
        }


    }

    /**
     *Bir
     * method yazın boolean değer dondursun ve 2 sayı
     * kabul etsin sayıların son rakamı aynı ise true farklı ise
     * false döndürsün
     */
    public static void theLastOfDigit(int x, int y) {

        int lastofdigit1 = x % 10;
        int lastofdigit2 = y % 10;
      if(lastofdigit1==lastofdigit2){
          System.out.println("x and y  have the same last digit.");
        }else {
          System.out.println("x and y  have the different last digit.");

      }

    }
}



