package day_22_ClassAndObject_Memory_ders_Tekrari;

public class Math2 {
    //Ödev: Math2 sınıfı oluşturun ve
    //pow (taban, kuvvet) methodu yazın. Main sınıfı içerisinde
    //oluşturduğunuz sınıf içerisinden hesaplama yaptırın.
    int taban;
    int kuvvet;



    public static int pow(int taban,int kuvvet){

        if(taban==0){
            return 0;

        }

        int result=1;


        for (int i=1; i <=kuvvet; i++) {
            result*=taban;

           }
        return result;


    }
}
