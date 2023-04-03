package day_19_Custommethods_Return;

public class C03_Faktoriyel {
    public static void main(String[] args) {
        System.out.println(faktoriyelHesaplama(5));

    }
    public static int faktoriyelHesaplama(int sayi){
        int faktoriyel=1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel*=i;

        }
        return faktoriyel;
    }


}
