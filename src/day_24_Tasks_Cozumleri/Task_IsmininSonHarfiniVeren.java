package day_24_Tasks_Cozumleri;

public class Task_IsmininSonHarfiniVeren {
    public static void main(String[] args) {
        //İsminizin son 3 harfini 3 kez yazdıran bir
        //method oluşturun.
        String str="Serkan";
        String str2;

        for (int i = 0; i < 3; i++) {
           str2=str.substring(5);
            System.out.print(str2);

        }

    }


}
