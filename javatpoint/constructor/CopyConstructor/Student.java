package CopyConstructor;


// copy values from one constructor to another constructor
public class Student {
    int id;
    String name;

    Student(int id , String name){
        this.id = id;
        this.name = name;
    }

    Student(Student s){
        id = s.id;
        name=s.name;
    }

    public static void main(String[] args) {
        Student student = new Student(18,"Satyam");
        Student student1 = new Student(student);
        System.out.println(student.id + " " + student.name);
        System.out.println(student1.id + " " + student1.name);
    }
}
