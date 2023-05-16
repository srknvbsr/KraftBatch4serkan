package day_43_IntheritanceAndAccessKeyword;

public class Child extends Parent {
    static int x;
    int y;


   /* public Child() {
        super();

    } // java arka planda public child ()
    ve super(); çalıştırmaktadır.

    */

    public Child(String parentName) {
        super(parentName);
           }

    public void childMethod(int x) {
        System.out.println(x);//parametrenin içindeki
        //this.x (Child class x)
        //super(x) parent x olur

    }


}
