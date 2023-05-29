package day_56_JavaRewiev;

public class C08_MethodRewiev {
    public static void main(String[] args) {
        String str1="Disaster";
        printEach(str1);

    }
    public static void printEach(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }

    }




}
