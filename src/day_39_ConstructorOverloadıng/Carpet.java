package day_39_ConstructorOverloadıng;

public class Carpet {
    public double length, width, unitPrice;
    boolean isHandMade;

    public Carpet(double length, double width) {
        this.length = length;
        this.width = width;

    }

    public Carpet(double length, double width, double unitPrice, boolean isHandMade) {
        this(length, width);
        this.isHandMade = isHandMade;
        this.unitPrice = unitPrice;
    }

    public double calcPrice() {
        double totalPrice = length * width * unitPrice;
        if (isHandMade) {
            totalPrice *= 5;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                ", length='" + length + "'" +
                ", width='" + width + "'" +
                ", unitPrice='" + unitPrice + "'" +
                ", isHandMade='" + isHandMade + "'" +
                ", totalPrice=" + calcPrice() + "}";

    }
}
