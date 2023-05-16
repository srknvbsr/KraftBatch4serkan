package day_50_Exception_Collection;

public class C04_Exception_8 {
    public static void main(String[] args) {

        /*int i=50;
        if(i<100){
            System.out.println(1);
        } else if (i<70) {
            System.out.println(2);
        } else if (i<=50) {
            System.out.println(2);
        }else{
            System.out.println(4);
        }



        try
        {
            System.out.println(5/0);
        } catch (ArithmeticException a){
            System.out.println(1);
        } catch (Exception e){
            System.out.println(2);
        }
        System.out.println("Kod devam eder");

         */


       /*String str = null;
        if(str==null){

        }

        try{
            for (int i = 0; i < str.length(); i++) {
                System.out.println(i);
            }
        } catch (ArithmeticException a){//aritmetic Exception yazmasakta ılur.NullPointer ve Aritmetic exceptonları yer
            //değiştirebiliriz. Çünki seviye olarak aynı olduğu için.

            System.out.println("Aritmetic ");
        } catch (NullPointerException a){
           a.printStackTrace();
        } catch (RuntimeException a){
            System.out.println("run time");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception");
        }finally{
            System.out.println("Her zaman çalışır");
        }
        System.out.println("Kod devam eder");

        */

        String str = null;
        if (str == null) {

        }


        try {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(i);
            }
        } catch (ArithmeticException | NullPointerException b){
            b.printStackTrace();
            System.out.println("Aritmetic ");
        } catch(RuntimeException a){
            System.out.println("run time");
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception");
        }finally{
            System.out.println("Her zaman çalışır");
        }
        System.out.println("Kod devam eder");


    }//MAİN SÜSLÜ PARANTEZ SONU.


}
