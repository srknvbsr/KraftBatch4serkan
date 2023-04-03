package day_24_Tasks_Cozumleri;

public class Task_Y_harfini_Veren_program {
    public static void main(String[] args) {
        //"
        //javayı Sevi yor muyum? ifadesindeki y harfinin sayısını veren
        //bir program yazın.
       /* String str="javayı seviyormuyum?";
        String str2="";
        int lngth1=str.length();
        System.out.println(lngth1);
        System.out.println(str2=str.replace("y", ""));
        System.out.println(str2.length());
        int str3=str.length()-str2.length();
        System.out.println("Javayı Seviyor muyum? ifadesindeki y harfinin sayısı= "+str3);

        */
        System.out.println(yHarfisayisi("javayı seviyormuyum?"));


    }
    //"
    //javayı Sevi yor muyum? ifadesindeki y harfinin sayısını veren
    //bir program yazın.//"
    //        //javayı Sevi yor muyum? ifadesindeki y harfinin sayısını veren
    //        //bir program yazın.
    public static int yHarfisayisi(String str){
        return str.length()-(str.replace("y","").length());

    }

}

