class TestStudent{
  int rollno ;
  String Name;
  public void insertRec(int r, String n){
  rollno =r;
  Name =n;

  }
  public void displayInfo(){
    System.out.println(rollno + " " + Name);

  }
  
}
public class javatpointStudent{
  public static void main(String[] args) {
    TestStudent s1 = new TestStudent();
    TestStudent s2 = new TestStudent();
    s1.insertRec(18, "satyam");
    s2.insertRec(20, "pawan");
    s1.displayInfo();
    s2.displayInfo();
  }
}