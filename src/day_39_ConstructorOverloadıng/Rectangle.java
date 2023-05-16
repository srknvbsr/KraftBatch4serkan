package day_39_ConstructorOverloadıng;

import org.w3c.dom.css.Rect;

public class Rectangle {

    public double length,width;

    public Rectangle(){

    }

    public Rectangle(double length,double width){
        this();
        this.width=width;
        this.length=length;

    }
    public double calculateArea(){
        // this() burada kullanılmaz
        // çünkü consructor başka bir contructor içinde çağrılır.
        return length*width;
    }
    public double  calculatePerimeter(){
        return 2*(length+width);
    }
    public String toString(){
        return "Rectangle{"+"length='"+length+"Wigth='"+width+"'"+", area='"
                +calculateArea()+
                ", perimeter='"+
                calculatePerimeter()+"'}";
    }




}
/*
create a custom class named Rectangle
    Attributes:
        length, width

    Add a constructor that can set all the fields

    Actions:
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
         toString(): displays the width, length, area and perimeter of the rectangle when an object of rectangle passed in the print statement
 */
