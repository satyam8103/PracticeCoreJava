public class Student {
  int age;
  String name;

  // Default constructor
  Student() {
      // Calling parameterized constructor using this()
      this(0, "Unknown");
  }

  // Parameterized constructor
  Student(int age, String name) {
      // Using this to differentiate instance variables from parameters
      this.age = age;
      this.name = name;
  }

  // Method to set student details
  public void setDetails(int age, String name) {
      // Using this to refer to the instance variables
      this.age = age;
      this.name = name;
  }

  // Method to display student details
  public void displayDetails() {
      System.out.println("Student Name: " + this.name + ", Age: " + this.age);
  }

  // Method to return the current class instance
  public Student getStudent() {
      return this;
  }

  public static void main(String[] args) {
      // Creating a student object using default constructor
      Student s1 = new Student();
      s1.displayDetails(); // Output: Student Name: Unknown, Age: 0

      // Creating a student object using parameterized constructor
      Student s2 = new Student(20, "Satyam");
      s2.displayDetails(); // Output: Student Name: Satyam, Age: 20

      // Using setDetails method
      s2.setDetails(21, "Rahul");
      s2.displayDetails(); // Output: Student Name: Rahul, Age: 21

      // Using getStudent method
      Student s3 = s2.getStudent();
      s3.displayDetails(); // Output: Student Name: Rahul, Age: 21
  }
}
