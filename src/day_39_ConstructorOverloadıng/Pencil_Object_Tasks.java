package day_39_ConstructorOverloadıng;

public class Pencil_Object_Tasks {
    public static void main(String[] args) {
        Pencil_Tasks pencil1=new Pencil_Tasks("kırmızı",10,false);
        System.out.println("pencil1.isHaveEraser = " + pencil1.isHaveEraser);
        System.out.println("pencil1.color = " + pencil1.color);
        System.out.println("pencil1.length = " + pencil1.length);
        System.out.println("pencil1 = " + pencil1);
        pencil1.write();
        pencil1.delete();
    }
}
