package day_39_ConstructorOverloadıng;

import day05_SummaryandProject.Triangel;

public class Pencil_Tasks {
    //Pencil
    //adında bir class oluşturun, color , lenght ,
    // haveEraser adında fields tanımlayın,
    //constructors (4 adet) , write ve
    // delete metodları oluşturarak main metodunda
    // bu class dan bir obje oluşturun.( this () metodu
    String color;

    int length;

    boolean isHaveEraser;

    public Pencil_Tasks() {

    }

    public Pencil_Tasks(String color) {
        this();
        this.color = color;
    }

    public Pencil_Tasks(String color, int length) {
        this(color);
        this.length = length;

    }

    public Pencil_Tasks(String color, int length, boolean isHaveEraser) {
        this(color, length);
        this.isHaveEraser = isHaveEraser;


    }

    public  void write() {
        System.out.println("Kalem " + color + " renk ile yazar");
    }

    public void delete() {
        if (isHaveEraser) {
            System.out.println(length+" cm uzunluğundaki"+color+ " kalem silebilir");
        }
        System.out.println(length+" cm uzunluğundaki"+color+ " kalem silemez");

    }
    public String toString(){
        return "Pencil{"+"color='"+color+
                ", length='"+length+
                ", ishaveEraser='"+isHaveEraser+"'}";

    }

}
