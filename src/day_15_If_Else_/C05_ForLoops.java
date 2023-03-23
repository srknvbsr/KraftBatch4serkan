package day_15_If_Else_;

public class C05_ForLoops {
    public static void main(String[] args) {
       /* for(int i = 1;i<100; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        int i=0;
        while (i<=100){
            if(i%2==0){
                System.out.print(i+" ");

            }
            i++;
        }

        */
        for (int i = 0,k=1; i <5 ; i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }



    }
}
