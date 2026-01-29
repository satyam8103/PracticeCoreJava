public class This_Student{

  int age;
  String name;

  //default constructor
  This_Student(){
  // Calling parameterized constructor using this()

    this(0, "unknown");
  }

    // Parameterized constructor
  This_Student(int age, String name) {
    // Using this to differentiate instance variables from parameters
    this.age = age;
    this.name = name;
}

// Method to set student details
  public void setDetails(int age,String name){
    this.age =age;
    this.name =name;
  }
 // Method to display student details
  public void displayDetails(){
    System.out.println("Student Name: " + this.name + ", Age: " + this.age);
  }

// Method to return the current class instance
  public This_Student getStudent() {
    return this;
}


  
  public static void main(String[] args) {
   // Creating a student object using default constructor
    This_Student s1 = new This_Student();
    s1.displayDetails();
    // Creating a student object using parameterized constructor
    This_Student s2 = new This_Student(20, "Satyam");
    s2.displayDetails(); // Output: This_Student Name: Satyam, Age: 20

    // Using setDetails method
    s2.setDetails(21, "Rahul");
    s2.displayDetails(); // Output: This_Student Name: Rahul, Age: 21

    // Using getStudent method
    This_Student s3 = s2.getStudent();
    s3.displayDetails(); // Output: Student Name: Rahul, Age: 21


  }

}