package day_24_StringClass_Cont;

public class C08_Palindrom {
    public static void main(String[] args) {
        String word = "civic";
        String reverse = "";//bu haliyle yazmaz çünki string ifade immuate yani değiştirilemez
                            // olduğu için console hiçlik yazar.onun için
                            // reverse= reverse.concat(word.substring(i,i+1));
        for (int i = word.length() - 1; i >= 0; i--) {
           reverse=reverse.concat(word.substring(i,i+1));

        }
       // System.out.println(reverse);
        boolean isPalindrome = reverse.equals(word);
        System.out.println("isPalindrome= "+isPalindrome);
    }
}
