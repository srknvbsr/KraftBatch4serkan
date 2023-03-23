package day12_SwitchCaseDersTekrarı;

public class C01_Summary {
    public static void main(String[] args) {
        /*System.out.println("A");
        if(true){
            System.out.println("B");
        }
        System.out.println("C");



        System.out.println("A");
        if((5>10)&&true){
            System.out.println("B");
        }
        System.out.println("C");



        System.out.println("A");
        if((5>10)&&true||false){
            System.out.println("B");
        }
        System.out.println("C");


        System.out.println("A");
        int x = 20;
        if(!(x>10)&&true||!false){
            System.out.println("B");
        }else {
            System.out.println("C");
        }
        System.out.println("D");


        System.out.println("A");
        int x = 20;
        if(!(x>10)&&true||false){
            System.out.println("B");
        }else {
            System.out.println("C");
        }
        System.out.println("D");

         */
        System.out.println("A");
        int x = 20;
        if (!(x > 10) && true || false) {
            System.out.println("B");
        } else if (true) {
            System.out.println("C");

        } else if (true) {
            System.out.println("D");


        } else if (true) {
            System.out.println("E");
        }
        System.out.println("F");

    }
}
