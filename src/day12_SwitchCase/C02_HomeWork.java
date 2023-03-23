package day12_SwitchCase;

public class C02_HomeWork {
    public static void main(String[] args) {
        //Bir program yazın
        // 3 tane numara kabul etsin ve büyük olanı versin.(homework)
        // 2 veya 3 farklı yol ile çözmeye çalışın.
        /*int x,y,z;
        x=50;
        y=60;
        z=15;
        System.out.println("max deger"+(Math.max(Math.max(x,y),z)));


        int x,y,z;
        x=50;
        y=60;
        z=15;
       int first= Math.max(x,y);
       int max = Math.max(first,z);
        System.out.println(max);


        int x,y,z;
        x=50;
        y=60;
        z=70;
        if(x>=y&&x>=z)
        {
            System.out.println("x = " + x);
        } else if (y>=x&&y>=z) {
            System.out.println("y = " + y);
        }else{
            System.out.println("z = " + z);
        }

         */
        //3 sayı alın sayılar birbirine eşit olan sayıyı ekrana getiren eşit sayı
        //min 2 sayı eşit olamlı
        // yok ise ekrana eşit sayı yoktur yazan
        //programı yazınız.
        int x,y,z;
        x=12;
        y=10;
        z=10;
        if(x==y){
            System.out.println("x = " + x);
        }
        else if (y==z){
            System.out.println("y = " + y);
        } else if (x==z){
            System.out.println("z = " +z);

        }else {
            System.out.println("Eşit sayı yoktur.");
        }



    }
}
