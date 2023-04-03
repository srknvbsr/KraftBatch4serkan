package day_23_StringClass;

public class C01_StringIntro {
    public static void main(String[] args) {
        String str1 = "hello";//>>>>String literal>>>>Heap içine>>>>String pool a yazar.
        String str2 = "hello";//>>>>String literal>>>>heap içinde olup olmadığına bakar aynısı
        // varsa oradan alarak yazar.
        String str3 = "hello";// büyük harf ile yazıldığı için string poolun içine yazışır.
        String str4 = new String("Hello");//>>>yeni object olduğu için hiç
        // heap içine var mı yok mu diye bakmdan strin pollun içine değil
        // direk heape yazar.
        boolean bl;
        bl = str1 == str2;//eğer bl ye intiliaze yapamsaydım o zaman bl ye ikaz vercekti.
        System.out.println("bl = " + bl);
        bl=str1.equals(str2);
        System.out.println("bl = " + bl);
        System.out.println("---------------------------------------");
        bl = str1 == str3;
        System.out.println("bl = " + bl);
        bl=str1.equals(str3);
        System.out.println("bl = " + bl);
        System.out.println("---------------------------------------");
        bl=str1==str4;
        System.out.println("bl = " + bl);
        bl=str1.equals(str4);
        System.out.println("bl = " + bl);
        System.out.println("---------------------------------------");


    }
}
