package day_49_Exception_1;

public class C03_Exception_3 {
    public static void main(String[] args) {
//unchekced();//Compile esnasında herhangi bir hata vermez.Run time esnasında hata verir.
//        System.out.println(metot(null));
String [] arr={"Harun"};
        System.out.println(arr[2]);//Unchecked exception.//ArrayIndexOutOfBoundsException

    }//MAİN SON SÜSLÜ PARANTEZİ.

   /* public static void unchekced() {

        System.out.println("1");
        try {
            System.out.println("2");
            System.out.println(5 / 0);
        } catch (Exception e) {
            System.out.println(5 / 0);
            System.out.println("3");
        } finally {
            try {
                System.out.println(5 / 1);
            } catch (Exception f) {
                System.out.println("9");
            }

            System.out.println("4");
        }

    }
     */

    /* public static void normalMtehod() throws InterruptedException {
         checked();
     }


     public static void checked() throws InterruptedException {
         Thread.sleep(3000);// Eğer handle yapmaz isen throw fırlatma ltaktiğini uygulalyacaksın.

     }

     */
    public static String metot(String str) {
        try {

            String result = "";

            for (int i = str.length() - 3; i < str.length(); i++) {
                result += str.charAt(i);

            }

            return result;
        } catch (Exception e) {
            return null;
        }
    }

}




