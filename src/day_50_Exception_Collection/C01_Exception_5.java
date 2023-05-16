package day_50_Exception_Collection;

public class C01_Exception_5 {
    public static void main(String[] args) {

    }
    public static int faktoriyel(int n){
        int result=1;
        for (int i = 0; i <=n; i++) {
            result*=i;
        }
        return result;

    }
    public static int faktoriyelBetter(int n){
        try{
            int result=1;
            for (int i = 0; i <=n; i++) {
                result*=i;
        }
            return result;
        }catch (Exception e ){
            return -1;
        }


    }
}
