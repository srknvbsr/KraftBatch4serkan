package day13_ForLoops_DersTekrarı;

public class TASKS_9 {
    public static void main(String[] args) {
      /*  //Örnek: //Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        //1
        //12
        //123
        //1234
        //12345
        //123456


        for(int i = 1 ;i<=6;i++)
        {
            for(int j=1;j<=i;j++)
            {

                System.out.print(j);



        }
            System.out.println();


        //Örnek:
//Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
//1
//22
//333
//4444
//55555
//666666
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i);


            }
            System.out.println();


        }


        //Örnek:
        //Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15
        for (int i = 0, k = 1; i < 5; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print(k + "  ");
                k++;

            }
            System.out.println();
                 */
        //Ödev:
        //Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        int size = 5;
        for (int i = 1; i < size; i++)
        {

            for (int j = 0; j < size - i - 1; j++)
            {
                System.out.print(" ");
            }

            for (int k = 1; k <=2 * i ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}







