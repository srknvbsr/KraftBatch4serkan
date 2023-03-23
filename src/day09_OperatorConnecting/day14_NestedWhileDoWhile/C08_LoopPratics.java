package day09_OperatorConnecting.day14_NestedWhileDoWhile;

public class C08_LoopPratics {
    public static void main(String[] args) {
        for(int i= 1;i<=10;i++){
            System.out.print(i+ " ");

        }
        System.out.println();
        System.out.println("---------------------------------------------------");
        int i= 1;
        while(i<=10){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println();
        System.out.println("---------------------------------------------------");
        int j= 1;
        do{
            System.out.print(j+" ");
            j++;
        }while (j<=10);
        System.out.println();
        System.out.println("---------------------------------------------------");



    }
}
