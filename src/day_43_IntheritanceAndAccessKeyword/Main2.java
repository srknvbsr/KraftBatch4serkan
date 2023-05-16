package day_43_IntheritanceAndAccessKeyword;

public class Main2 {
    public static void main(String[] args) {
        Banka banka1 = new Banka();
        banka1.bankName = "Akbank";
        System.out.println(banka1.bankName);
        banka1.genelMerkezAdresi = "Ankara Yenimahalle";
        System.out.println(banka1.genelMerkezAdresi);
        banka1.getGenelMerkez = "03123666666";
        System.out.println(banka1.getGenelMerkez);
        System.out.println(banka1.getSubeSayisi());

        Sube sube1 = new Sube();
        sube1.subeAdi = "Merkez";



        Musteri musteri1 = new Musteri();
        Banka.karsilama();
        musteri1.musteriAdSoyad = "Serkan çağlar";
        System.out.println(musteri1.getMusteriAdSoyad());
        musteri1.bankName = "Akbank";

        Banka.BankAccountMenu();


    }


}
