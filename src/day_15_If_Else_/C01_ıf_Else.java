package day_15_If_Else_;

public class C01_ıf_Else {
    public static void main(String[] args) {
    int not= 85;
    String str = "";
    if (not<40){
        str = "F";

    } else if (not<55)     {
    str="D";
    }else if (not<70)     {
        str="C";
    }else if (not<85)     {
        str="B";
    }else {
        str ="A";

    }
        System.out.println(str);

    }
}
