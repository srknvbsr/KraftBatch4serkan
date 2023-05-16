package day_39_ConstructorOverloadıng;

public class Squard_Tasks {
    //Square adında bir class oluşturun,
    // sideLenght adında field tanımlayın, constructors ,
    //calculateArea ve calculatePerimeter metodları oluşturarak
    // main metodunda bu class dan
    //bir obje oluşturun.
    public int sideLength;

    public Squard_Tasks(int sideLength) {
        this.sideLength = sideLength;
    }

    public int calculateArea() {
        int area = sideLength * sideLength;
        return area;

    }
    public int calculatePerimeter() {
        int perimeter = 4 * sideLength;
        return perimeter;

    }
    public String toString(){
        return "Squard {"+"sideLength='"+sideLength+
                "area='"+calculateArea()+", perimeter='"+
                calculatePerimeter()+"'}";
    }


}
