package day_19Custommethods_Return_Ders_tekrarı;

public class C08_TASKS_01 {
    public static void main(String[] args) {
        System.out.println("lastDigit(30,45) = " + lastDigit(30, 45));
        System.out.println("lastDigit(50,100) = " + lastDigit(50, 100));
    }
    //Bir
    //method yazın boolean değer dondursun ve 2 sayı
    //kabul etsin sayıların son rakamı aynı ise true farklı ise
    //false döndürsün
    public static boolean lastDigit(int num1,int num2){
       boolean lastDigit;
        if(num1%10==num2%10){
            lastDigit=true;

        }else {
             lastDigit=false;
        }
        return lastDigit;


    }

}
