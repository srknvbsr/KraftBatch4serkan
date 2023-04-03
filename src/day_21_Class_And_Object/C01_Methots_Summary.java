package day_21_Class_And_Object;

public class C01_Methots_Summary {
   public static void main(String[] args) {
       int x = seven();
        System.out.println(seven());

    }



    public static int seven() {
        return 7;
    }



    public static int seven2() {
        int i = 0;
        while (true) {
            i++;
            if (i == 5) {
                continue;
            } else if (i == 7) {
                //break; yerine
                return i;
            }
            System.out.println(i);


        }
    }
}


