package day_19Custommethods_Return_Ders_tekrarı;

public class C08_TASKS_04 {
    //Bir
    //method yazın dönüş tipi char olsun 3 ders notu kabul
    //etsin ve ortalamayı harf cinsinden döndürsün.
    public static void main(String[] args) {
        System.out.println("grade(50,60,70) = " + grade(50, 60, 70));
        System.out.println("grade(20,30,40) = " + grade(-20, -30, 40));
    }

    public static char grade(int lesson1, int lesson2, int lesson3) {
        char grade;
        double ortalama = (lesson1 + lesson2 + lesson3) / 3;
        if (ortalama >= 76 && ortalama <= 100) {
            grade = 'A';
        } else if (ortalama >= 51 && ortalama <= 75) {
            grade = 'B';
        } else if (ortalama >= 0 && ortalama <= 50) {
            grade = 'C';
        } else {
            grade ='F';



        }
        return grade;

    }
}


