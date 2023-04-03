package day_21_Class_And_Object_dersTEkrari;

public class C01_Methods_Summary {
    public static void main(String[] args) {
       // System.out.println("seven2() = " + seven2());
        System.out.println("max(10,15) = " + max(10, 15));

    }
    public static int seven2(){
        int i = 0;
        while(true){
            i++;
            if(i==5){
                continue;
            }else  if (i==7){
               // break; yerine return kullanışabilir.
                return i;
            }
            System.out.println(i);
        }

    }

    public static int max(int x,int y){
        int max;
        if(x>y){
             max=x;
        }else{
             max=y;

        }
        return max;
    }
}

