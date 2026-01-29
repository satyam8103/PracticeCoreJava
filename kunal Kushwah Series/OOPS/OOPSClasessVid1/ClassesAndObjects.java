package OOPSClasessVid1;

import java.util.Arrays;

public class ClassesAndObjects {

    public static void main(String[] args) {
    Student[] students = new Student[5];
      Student obj;
        Student student = new Student(); // we have made this static otherwise it will not work
        //if you do not want to make this static or you want to make an object
        // of the student class without using static keyword so make the class student outside the main class
        // see the example in the next program which is OOpsVid1Constructor.java;

//        System.out.println(Arrays.toString(students));

//        obj.marks; // give error because value is not initialized in obj variable
//        obj.marks = 09.0f;

        student.marks =80.8f;
        System.out.println(students);
        System.out.println(student.marks);
        System.out.println(student.name);
    }
    static class Student{

        int rollNo;
        String name;
        float marks = 89.0f;
    }
//    Student student = new Student();


}
