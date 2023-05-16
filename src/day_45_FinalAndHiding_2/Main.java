package day_45_FinalAndHiding_2;

public  class Main {
    public static void main(String[] args) {


        A a = new A();
        System.out.println(a.x);
        A.metod();
        B b = new B();
        System.out.println(b.x);
        B.metod();
        Fish fish=new Fish();
        fish.hareketEt();
        fish.konus();
        Dog dog=new Dog(7);
        System.out.println(dog.x);
        dog.hareketEt();
        dog.konus();

       /* FinalAndHiding finalAndHiding = new FinalAndHiding();
        FinalAndHiding finalAndHiding2 = new FinalAndHiding();

        */


       /* final int[] arr = new int[5];
        int[] arr1 = new int[5];
        arr[0] = 5;
        arr[0] = 10;
        System.out.println(arr);//referan adfresi.
        //arr = arr1;//arr finak olduğu iin referansı değiştiremezsin
        arr1=arr;
        System.out.println(arr1[0]);
        final ArrayList<String >arrayList=new ArrayList<>();
        arrayList.add("Harun");
        arrayList.add(0,"mehmet");
        arrayList.set(0,"Mehmet");
        System.out.println(arrayList.get(1));
        arrayList.add("ahmet");
        arrayList.remove(1);
        System.out.println(arrayList.get(1));
*/


    }


    // void metot1() {//parent final olunca mecburen metot ismi değişmesi gerekir.
    //  System.out.println("ben childim");


}
// Animal animal=new Animal();//animal clası abstract olduğu için hata veriyor.Yani objejye izin vermem diyor.



