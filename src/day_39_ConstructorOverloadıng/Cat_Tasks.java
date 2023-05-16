package day_39_ConstructorOverloadıng;

public class Cat_Tasks {
    //Cat
    //adında bir class oluşturun, eyeColor , breed , isFat ,
    // isPet adında fields tanımlayın,
    //constructors (5 adet), sleep , food , run
    // metodları oluşturarak main metodunda bu class dan
    //bir obje oluşturun.


    String eyeColor;
    String breed;
    boolean isFAt;
    boolean isPet;

    public Cat_Tasks() {

    }

    public Cat_Tasks(String eyeColor) {
        this.eyeColor = eyeColor;

    }

    public Cat_Tasks(String eyeColor, String breed) {
        this(eyeColor);
        this.breed = breed;

    }

    public Cat_Tasks(String eyeColor, String breed, boolean isFAt) {
        this(eyeColor, breed);
        this.isFAt = isFAt;

    }

    public Cat_Tasks(String eyeColor, String breed, boolean isFAt, boolean isPet) {
        this(eyeColor, breed, isFAt);
        this.isPet = isPet;

    }
    public void sleep(){
        if(isFAt&&isPet){
            System.out.println(breed+"olan ve "+eyeColor+"gözlü kedi çok uyuyor");
        }else {
            System.out.println(breed+"olan ve "+eyeColor+"gözlü kedi çok hareketli");
        }

    }
    public void food(){
        if(isFAt){
            System.out.println(breed+"olan ve "+eyeColor+"gözlü kedi çok yemek yiyo");
        }else {
            System.out.println(breed+"olan ve "+eyeColor+"gözlü kedi çok hareketli ve az yemek yiyor");
        }
    }
    public void run(){
        if(isFAt){
            System.out.println(breed+"olan ve "+eyeColor+"gözlü kedi koşmayı sevmiyor");
        }else {
            System.out.println(breed+"olan ve "+eyeColor+"gözlü kedi çok hareketli ve çok koşuyor");
        }
    }
    public String toString() {
        return "Cat{" +
                "eyecolor='" + eyeColor + "', " +
                "breed='" + breed + "', " +
                "isFat='" + isFAt + "', " +
                "isPet='" + isPet + "'}";

    }


}
