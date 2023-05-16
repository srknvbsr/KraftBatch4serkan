package day_47_Polymorphism.shape;

public class Cube extends Shape implements Volume{
private double side;

    public Cube(double side) {
        super("Cube");
        setSide(side);//Buranın yapılma amacı;
                        // eğer burayı this.side=side olarak bırakırsak
                     // sınırlandırma koymamış oluyoruz. Biz aşağıda setside metodunda sınırlama yaptığımız için
                     // burada setSide(side) yazarız. Mesela kullanıcı eğer -3 girdiğini varsayarsak this ile bu eksi 3
                    // ifadeyi sınırlandırma olmadığı için almış oluruz. Bu da metodun yanlış çalışmasını sağlar.
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<0){
            System.err.println("Invalid side"+side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double perimeter() {
        return 12*side;
    }

    @Override
    public double volume() {
        return side*side*side;
    }
}
