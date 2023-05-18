package day_56_JavaRewiev;

public class C03_StringClass {
    public static void main(String[] args) {
        String str="scholl";
        String str1="scholl";
        String str2=new String("school");
        String str3=new String("school");
       String str4= str.toUpperCase();
        System.out.println("str4 = " + str4);
        //StringBuffer stringBuffer="scholl";//string literal string pool da stringBuffer ve String Builder kullanılmaz.
        StringBuffer stringBuffer=new StringBuffer("school");
        System.out.println("stringBuffer = " + stringBuffer);
        StringBuilder stringBuilder = new StringBuilder("school");
        System.out.println("stringBuilder = " + stringBuilder);
        System.out.println("str1.concat(\" garden\") = " + str1.concat(" garden"));
        System.out.println("str1 = " + str1);

        System.out.println("stringBuilder.append(\" garden\") = " + stringBuilder.append(" garden"));

        System.out.println("stringBuilder.reverse() = " + stringBuilder.reverse());
        System.out.println("stringBuffer.reverse() = " + stringBuffer.reverse());



    }
}
