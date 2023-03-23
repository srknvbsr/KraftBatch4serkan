package day09_OperatorConnecting.day14_NestedWhileDoWhile;

public class C04_NestedFor {
    public static void main(String[] args) {
        //Örnek:
        //Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        //111111
        //111111
        //111111
        //111111
        //111111
        //111111
        /*for(int i = 0 ; i<=5;i++){
            for (int j=0;j<=5;j++){
                System.out.print(1);
            }
            System.out.println();
        }


        for(int i = 0 ; i<=5;i++){
            for (int j=0;j<=5;j++){
                System.out.print(j);
            }
            System.out.println();
        }


        //Örnek:
        //Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız
        //kulanarak
        //*
        //**
        //***
        //****
        //*****
        //******
        for(int i = 1; i<=6;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
            }
         */



        //Örnek:
        //Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız
        //kulanarak
        //******
        //*****
        //****
        //***
        //**
        //*
        for(int i =0;i<6; i++){
            for(int j = i;j<=6;j++){
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
