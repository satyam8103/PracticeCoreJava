package OOPSClasessVid1;

public class OOPsVid1Constructor {
    public static void main(String[] args) {
//        Student student1 = new Student(); // when new object is created it will go inside the constructor
        Student student2 = new Student(55,"Shekhar",90.67f);
        //which we have defined default constructor
//        student.marks = 90.0f;
//        System.out.println(student1.marks);
//        System.out.println(student1.name);

        System.out.println(student2.name); // output shekhar
        System.out.println(student2); // output garbage value Student@6acbcfc0
        System.out.println(student2.marks);
        student2.ChangeName("satyam");
        student2.greeting();
    }

}
class Student{

    int rollNo;
    String name;
    float marks = 89.0f; // it will not print because we are using this keyword

//    Student(){
//        this.marks = 89.5f;
//        this.name = "satyam";
//        this.rollNo = 18;
//    }
    Student(int rollNum,String naam,float grades){   //it is possible in java we can use parametrized constructor
        //we can call also this type of constructor
        this.rollNo = rollNum;
        this.name = naam;
        this.marks = grades;
    }
//    Student(int rollNo,String name,float marks){   //it is not possible in java because default constructor will not allow this
//        //we can call also this type of constructor  if we use this keyword
//        // here what is happenning local variable and instance variable both are same if we want to access
//        // use this keyword
//
//        rollNo = rollNo;
//        name = name;
//        marks =marks;
//    }

    void greeting(){
        System.out.println("my name is " + name);
        System.out.println("my name is " + this.name);
        //both will give same output
    }

    void ChangeName(String newName){
        name = newName;
    }

}

