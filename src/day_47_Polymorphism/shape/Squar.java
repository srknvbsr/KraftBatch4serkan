package day_47_Polymorphism.shape;

public class Squar extends Shape {
    private double side;

    public Squar(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0) {

            System.err.println("Invalid side"+ side);
        }

        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Squar{" +
                "side=" + side +
                '}';
    }
}
