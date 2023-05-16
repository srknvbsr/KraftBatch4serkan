package day_38_Consructors;

public class C04_StringArgsExample {
    //özel bir metod
    // args argument kısaltıması
    //String[]args
    //
    public static void main(String[] args) {
        System.out.println("args.length = " + args.length);
        for (String arg : args) {
            System.out.println(arg);

        }
        System.out.println("---------------------------------------");
        args[0]="isa";
        args[1]="musa";
        for (String arg:args){
            System.out.println("arg = " + arg);
        }
    }
}
