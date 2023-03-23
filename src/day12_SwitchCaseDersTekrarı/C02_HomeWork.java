package day12_SwitchCaseDersTekrarı;

public class C02_HomeWork {
    public static void main(String[] args) {
        //Bir program yazın
        // 3 tane numara kabul etsin ve büyük olanı versin.(homework)
        // 2 veya 3 farklı yol ile çözmeye çalışın.
       // int x = 20;
        //int y = 30;
      //  int z = 60;
        //System.out.println("en büyük değer :"+Math.max(z,(Math.max(x,y))));
       /* if (x >= y && x >= z) {
            System.out.println("en büyük değer : " + x);
        } else if (y >= x && y >= z) {
            System.out.println("y = " + y);

        } else {
            System.out.println("z = " + z);

        }
         */

        //3 sayı alın sayılar birbirine eşit olan sayıyı ekrana getiren eşit sayı
        //min 2 sayı eşit olamlı
        // yok ise ekrana eşit sayı yoktur yazan
        //programı yazınız.
        int x = 20;
        int y= 30;
        int z= 40;
        if(x==y){
            System.out.println("x = " + x);
        } else if (x==z) {
            System.out.println("x = " + x);
        } else if (y==z) {
            System.out.println("y = " + y);

        }else {
            System.out.println("eşit bir sayi bulunamadı");
        }


    }
}
