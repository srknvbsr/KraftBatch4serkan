package day_24_StringClass_Cont;

public class C09_UniqueCharacters {
    public static void main(String[] args) {

    String str ="aaabccd";
    String result="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);//a
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;

            }

        }
        System.out.println(result);

    }
}
