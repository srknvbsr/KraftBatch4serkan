package day_50_Exception_Collection;

public class C02_Exception_6 {
    public static void main(String[] args) {
        System.out.println("0");
        try {
            System.out.println("1");
            System.out.println(5 / 0);
            System.out.println("2");
            // Exception e=fırlatılan exception objesi.

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("3");
            try {
                System.out.println(5 / 0);
            } catch (Exception f) {
                System.out.println("4");
                System.out.println(5 / 0);
            } finally {//Her zaman blokların sonuna yazılır.
                {
                    System.out.println("5");
                }

            }
        }
    }
}


