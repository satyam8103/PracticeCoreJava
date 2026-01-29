// public class parameterizedConstructor {


//   //  with Static 

//    class Student{
//       int age;
//       String name;

//       //parameterized constructor

//     Student(int Student_age,String Student_name){
//       this.age =Student_age;
//       this.name = Student_name;

//     }
//   }

//     public static void main(String[] args) {
//       // parameterizedConstructor ref = new parameterizedConstructor();
//       Student s1 = new Student(20, "satyam");
//       System.out.println("Student Name: " + s1.name + ", Age: " + s1.age);

//   }
  
// }


// public class parameterizedConstructor {

//     static class Student {
//         int age;
//         String name;

//         // Parameterized constructor
//         Student(int studentAge, String studentName) {
//             this.age = studentAge;
//             this.name = studentName;
//         }
//     }

//     public static void main(String[] args) {
//         Student s1 = new Student(20, "Satyam");
//         // Printing the details to check if the object is created correctly
//         System.out.println("Student Name: " + s1.name + ", Age: " + s1.age);
//     }
// }


// //To avoid using an instance of the outer class (ParameterizedConstructor) to create an instance of the inner class (Student), 
// we can make the Student class a static nested class. This allows us to create an instance of Student without needing an instance of the outer class. 
// Here’s how you can do it:




public class parameterizedConstructor {
  // Main method in the outer class
  public static void main(String[] args) {
      Student2 s1 = new Student2(20, "Satyam");
      // Printing the details to check if the object is created correctly
      System.out.println("Student Name: " + s1.name + ", Age: " + s1.age);
  }
}

// Separate Student class
class Student2 {
  int age;
  String name;

  // Parameterized constructor
  Student2(int studentAge, String studentName) {
      this.age = studentAge;
      this.name = studentName;
  }
}
