package day_25_Summary;

public class Contains {
    public static void main(String[] args) {
        String kelime = "  Merhaba";
        String kelime2 = "r";
        System.out.println(kelime.contains(kelime2));
        System.out.println(iceriyorMU(kelime, kelime2));
        System.out.println(bosluklarSil(kelime));
        System.out.println(kelime2.trim());
        System.out.println(kelime.replace("Mer", "Har"));

    }

    public static boolean iceriyorMU(String str, String kontrol) {
        return str.contains(kontrol);
    }

    public static String bosluklarSil(String str) {
        return str.trim();

    }

    public static String degistir(String str, String eskiKelaime, String yeniKelime) {
        return str.replace(eskiKelaime, yeniKelime);
    }
    //replaceFirst()

}
