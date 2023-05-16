package day_42_StaticAndInheritance;

public class B  {
    public static int s=3;
    public int n;
    public int z;

    static {
        System.out.println("Statik blok çalıştı.");
    }
    {
        System.out.println("Block çalıştı.");
    }

    {
        System.out.println("Block çalıştı.");
    }

    public B(){
        System.out.println("Boş cons çalıştı");

    }
    public B(int n){
        this();
        this.n=n;
        System.out.println("Dolu cons çalıştı");
    }







}
