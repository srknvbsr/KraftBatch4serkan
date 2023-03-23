package day_16_Branching_Statemement_DersTekarari;

public class C03_Methods_01 {
    public static void main(String[] args) {
        /*for (int i = 0; i <= 100; i++) {
          if (i>30&&i<50){
                continue;
            }
            System.out.print(i);


        }

         */
        for (int i = 0; i <= 100; i++) {
            if ((i%13==0)){
                continue;
            }
            System.out.print(i +" ");


        }
    }
}
