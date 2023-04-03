package day_19Custommethods_Return_Ders_tekrarı;

public class C05_NameOfMonth {
//Create a method that can display the name of the month based on the given number to the method
public static void main(String[] args) {
    System.out.println("nameOfMonth() = " + nameOfMonth(13));

}
public static String nameOfMonth(int number){
    String name = " ";
    switch (number){
        case 1:
            name="January";
            break;
        case 2:
            name="February";
            break;
        case 3:
            name="March";
            break;
        case 4:
            name="April";
            break;
        case 5:
            name="May";
            break;
        case 6:
            name="Jun";
            break;
        case 7:
            name="July";
            break;
        case 8:
            name="Aug";
            break;
        case 9:
            name="Sep";
            break;
        case 10:
            name="Nov";
            break;
        case 11:
            name="Oct";
            break;
        case 12:
            name="Dec";
            break;
        default:
            name ="İnvalid";

    }
    return name;

}
}
