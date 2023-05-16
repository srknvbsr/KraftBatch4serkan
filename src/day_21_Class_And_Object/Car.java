package day_21_Class_And_Object;

public class Car {
    String marka;
    int Modelyili;
    int beygir;
    String saseNo;
    boolean isSuv;
    boolean isManual;


    public void hizlan(){
        System.out.println("Araç hızlanıyor");
    }
    public String beygirKarsilastir(){
        if(beygir>100){
            return "Güçlü Araç";
        }
        return "Zayıf Araç";
    }



}
