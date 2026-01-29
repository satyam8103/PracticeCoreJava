package OOPSClasessVid1;

public class ConstructorOverloading {
    public static void main(String[] args) {
    OverLoadStudent satyam = new OverLoadStudent(28,"Arpit",86);
        System.out.println(satyam.rollNum);
        OverLoadStudent abhi = new OverLoadStudent();
        System.out.println(abhi.name);
        System.out.println(abhi.rollNum);
        System.out.println(abhi.marks);
        System.out.println(satyam.marks);
        System.out.println(satyam.name);
        System.out.println(satyam.rollNum);
    }
}
class OverLoadStudent{
    int rollNum;
    float marks;
    String name;

//    OverLoadStudent(OverLoadStudent other){
//        name = other.name;   // satyam.name  = abhi.name
//        this.rollNum = other.rollNum;  //satyam.rollNum  = abhi.rollNum
//        this.marks = other.marks;
//    }
    OverLoadStudent (){
        this(22,"Tanuj",81);
    }
    OverLoadStudent(int rollNum,String naam,float grades){   //it is possible in java we can use parametrized constructor
        //we can call also this type of constructor
//        rollNum = 18; // output 0; without this
//        this.rollNum = 18;
        this.rollNum = rollNum;
//        this.name = "punit";
        this.name = naam;
//        this.marks = 70;
        this.marks = grades;
    }
}
