package day_23_StringClass;

public class C02_StringClassMethods {
    public static void main(String[] args) {
        //length
        String programmingLanguage = "java";// String pool icerisinde bir obje olusturdu
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());
        System.out.println("-----------------------------------------------1");
        programmingLanguage = "ptyhon";// String immutable, java yi isaret ediyordu, String poolda yeni obje
        // o objenin icine python yazdi.
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());
        System.out.println("-----------------------------------------------2");
        //TOUPPERCASE(), tolowercase()
        System.out.println("programmingLanguage.toUpperCase() = " + programmingLanguage.toUpperCase());
        System.out.println("-----------------------------------------------3");
        System.out.println("programmingLanguage.toLowerCase() = " + programmingLanguage.toLowerCase());
        System.out.println("-----------------------------------------------4");
        programmingLanguage = programmingLanguage.toUpperCase();
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("-----------------------------------------------5");
        System.out.println("programmingLanguage.toLowerCase() = " + programmingLanguage.toLowerCase());
        System.out.println("-----------------------------------------------6");
        //charAt();
        System.out.println("programmingLanguage.charAt(0) = " + programmingLanguage.charAt(0));
        System.out.println("-----------------------------------------------7");
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-1) = " + programmingLanguage.charAt(programmingLanguage.length() - 1));
        System.out.println("-----------------------------------------------8");
        //System.out.println("programmingLanguage.charAt(programmingLanguage.length()) = " + programmingLanguage.charAt(programmingLanguage.length()));
        //burada java ekrna yazı yazdırır ama consolede kırımızı bir ibare ile "Index 6 out of bounds for length 6"
        System.out.println("programmingLanguage.charAt(2) = " + programmingLanguage.charAt(2));
        System.out.println("-----------------------------------------------9");
        //concat()
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("-----------------------------------------------10");
        System.out.println("programmingLanguage.concat(\" Programlama Dili Java'dan daha kolaydir. \") = " +
                programmingLanguage.concat(" Programlama Dili Java'dan daha kolaydir. "));
        System.out.println("-----------------------------------------------11");
        programmingLanguage = programmingLanguage.concat(" Programlama Dili Java'dan daha kolaydir. ");
        System.out.println("------------------------------------12");
        //contains
        System.out.println(programmingLanguage);
        System.out.println("------------------------------------13");
        System.out.println(programmingLanguage.contains("Dili"));
        System.out.println(programmingLanguage.contains("Dili "));
        System.out.println(programmingLanguage.contains("Dili J"));
        System.out.println(programmingLanguage.contains(" Dili "));
        System.out.println(programmingLanguage.contains(" Dili  "));
        System.out.println("------------------------------------14");
        System.out.println(programmingLanguage.contains("python"));
        System.out.println("------------------------------------15");
        System.out.println(programmingLanguage.contains("P"));
        System.out.println("------------------------------------16");

        //Trim boşlukları alma
        String str="Hello World";
        System.out.println(str);
        System.out.println("------------------------------------17");
        str="            Hello World           ";
        System.out.println(str);
        System.out.println("------------------------------------18");
        System.out.println(str.trim());
        System.out.println("------------------------------------19");

        //replace
        //Bir
        //string değerdeki char değeri yada bir substring i değiştirir. Dönen
        //string değişimden sonraki yeni string dir.

        System.out.println(str.replace("Hello", "Big bang"));
        System.out.println("------------------------------------20");
        //indexOf(); Bir
        //string değer içinde başka bir string değerin ilk karakterinin index
        //numarasını döndürür. Döndürülen değer int tipindedir. Eğer bulamazsa 1
        //döndürür.
        String str1="Hello World";
        System.out.println(str1.indexOf("H"));
        System.out.println("------------------------------------21");
        System.out.println(str1.indexOf("W"));
        System.out.println(str1.indexOf(""));


    }

}
