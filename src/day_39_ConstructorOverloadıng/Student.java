package day_39_ConstructorOverloadıng;

public class Student {//Bunlar Classın instance variablelarıdır.
    public String name;

    public int age;

    public char gender;

    public int grade;

    public int id;

    //public Student(){


    // }
    public Student(String ad, int age, char gender, int grade, int id) {
        name = ad;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.grade = grade;

    }
    public String toString(){
        return "Student{"+
                "name= '"+name+"'"+
                ", age='"+age+"'"+
                ", gender='"+gender+"'"+
                ", grade='"+grade+"'"+
                " id='"+id+"'}";
    }


}


