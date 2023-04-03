package day_24_Tasks_Extra_Cozumleri;

public class Tasks_7 {
    public static void main(String[] args) {
        //Dün akşam eve giderken onları görmüştüm Cümlesindeki ü
        //harfinin önünde ve arkasında olan harflerden bir string üreten
        //bir method yazın.
        String str1= "Dün akşam eve giderken onları görmüştüm";
        String kelime1;
        String kelime2;
        String kelime3;
        System.out.println(str1.length());
        System.out.println(kelime1=str1.substring(0, 3).replace("ü", ""));
        System.out.println(kelime2=str1.substring(str1.length()-9,str1.length()));
        System.out.println(kelime2.substring(3,4).concat(kelime2.substring(5,6).concat(kelime2.substring(6,7).concat(kelime2.substring(8,9)))));



    }
}
