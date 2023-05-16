package day_32_Arrays_2;

public class C01_ForEachLoop_Tekrarı {
    public static void main(String[] args) {
        String arr[]=new String[5];
        arr[0]="Serkan";
        arr[0]="Esra";
        arr[0]="Büşra";
        arr[0]="Neva";//Son attana değer yazar.
       // System.out.println(arr[0]);
        String arr1[]=new String[5];
        arr[0]="Serkan";
        arr[1]="Esra";
        arr[2]="Büşra";
        arr[3]="Neva";
        System.out.println(arr[0]);
        String arr3[]={"Serkan","Harun","Merhaba"};
        //System.out.println(arr3[3]);//ArrayIndexOutOfBoundsException//Kkapasite aşımı
        System.out.println(arr3[0]);//ArrayIndexOutOfBoundsException//Kkapasite aşımı
    }
}
