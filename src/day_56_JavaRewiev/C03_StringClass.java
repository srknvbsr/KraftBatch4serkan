package day_56_JavaRewiev;

public class C03_StringClass {
    public static void main(String[] args) {
        //String literal are shared in string Pool
        //String literal is faster than keyword
        String str = "scholl";
        String str1 = "scholl";
        String str2 = new String("school");//Heap memory
        String str3 = new String("school");//Heap memory


        str.toUpperCase();//"SCHOLL"new string object have no referance after this line aligible for garbage collection
                          //"SCHOLL" yeni dize nesnesinin bu satırdan sonra referansı yok, çöp toplama için uygun.

        String str4 = str.toUpperCase();
        System.out.println("str4 = " + str4);


        //StringBuffer stringBuffer="scholl";//string literal, string pool stringBuffer ve String Builder kullanılmaz.

        StringBuffer stringBuffer = new StringBuffer("school");
        System.out.println("stringBuffer = " + stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("school");
        System.out.println("stringBuilder = " + stringBuilder);

        System.out.println("str1.concat(\" garden\") = " + str1.concat(" garden"));
        System.out.println("str1 = " + str1);
        System.out.println("------------------------------------------------");

        System.out.println("stringBuilder.append(\" garden\") = " + stringBuilder.append(" garden"));//String classta
        //bulunan concat metodunun String Builderda karşılığı append metodudur.


        System.out.println("stringBuilder.reverse() = " + stringBuilder.reverse());
        System.out.println("stringBuffer.reverse() = " + stringBuffer.reverse());


    }
}
