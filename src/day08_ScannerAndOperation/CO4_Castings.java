package day08_ScannerAndOperation;

public class CO4_Castings {
    public static void main(String[] args) {
        float bodyTemperature = 36.5f;
        byte num1 = (byte)bodyTemperature;//exlicit,narrowing,manuel
        //System.out.println((byte)bodyTemperature);
        short num2 = (short)bodyTemperature;
        int num3 = (int)bodyTemperature;
        float num4 = bodyTemperature;
        double d= bodyTemperature;//imlicit,automatic,widening
        long num6 = (long) bodyTemperature;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("d = " + d);
        System.out.println("num6 = " + num6);








    }
}
