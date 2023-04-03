package day_19Custommethods_Return_Ders_tekrarı;

public interface C08_TASKS_02 {
    //Bir
    //method yazın boolean değer döndürsün 1 sayı kabul
    //etsin asal sayı ise true versin
    public static void main(String[] args) {
        System.out.println("asalSayi(13) = " + asalSayi(13));
        System.out.println("asalSayi(10) = " + asalSayi(10));
    }

    public static boolean asalSayi(int number) {
        boolean asalSayi = true;
        for (int i = 2; i < number; i++) {

            if ((number % i == 0)) {
                asalSayi = false;
                break;
            } else {
                asalSayi = true;

            }

        }
        return asalSayi;
    }
}









