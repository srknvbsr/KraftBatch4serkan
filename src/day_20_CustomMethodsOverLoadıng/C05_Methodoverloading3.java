package day_20_CustomMethodsOverLoadıng;

public class C05_Methodoverloading3 {
    public static void main(String[] args) {
        methodX(5, "serkan", true);
        methodX(5, "serkan", false);
        methodX(5, "serkan");
    }


    public static void methodX(int i, String str, boolean bl) {
        if (bl == true) {
            System.out.println(i + str);
        } else {
            methodX(i, str);

        }

    }

    public static void methodX(int num, String str) {
        for (int i = 1; i <= num; i++) {
            System.out.println(str);

        }

    }
}



/*
 * 3 parametreli bir method yazin int ve String ve boolean tipinde 3 parametre alsin
 * Boolean true ise int ve String değeri concat yapsın.
 * false ise başka bir methodu çağırsın ve String değeri int kadar yazdırsın.*/
