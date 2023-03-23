package day09_OperatorConnecting.day14_NestedWhileDoWhile;

public class C03_ReverseString {
    public static void main(String[] args) {
        String str = "Serkan";
        //            012345(indeks numaraları)
        // System.out.println(str.length());
        /*System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));


        for (int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i));

        }

         */
        System.out.println();
        /*System.out.print(str.charAt(5));
        System.out.print(str.charAt(4));
        System.out.print(str.charAt(3));
        System.out.print(str.charAt(2));
        System.out.print(str.charAt(1));
        System.out.print(str.charAt(0));


        for (int i = str.length() - 1; 0 <= i; i--) {

            System.out.print
                    (str.charAt(i));

        }

         */
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

        System.out.println();
        System.out.print(str.charAt(5));
        System.out.print(str.charAt(4));
        System.out.print(str.charAt(3));
        System.out.print(str.charAt(2));
        System.out.print(str.charAt(1));
        System.out.print(str.charAt(0));
        System.out.println();
        for(int i = str.length() -1;0<=i;i--){
            System.out.print(str.charAt(i));
        }
    }

}
