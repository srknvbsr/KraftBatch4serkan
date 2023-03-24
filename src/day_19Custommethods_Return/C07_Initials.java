package day_19Custommethods_Return;

public class C07_Initials {
    //1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)
    public static void main(String[] args) {
        initials("Serkan","Çağlar");


    }
    public static String initials(String firtsname,String lastname){
        String result="";
        result=firtsname.charAt(0)+" . "+lastname.charAt(0);
        result = result.toUpperCase();
        return result;

    }
}
