public class StudentReadClassMainClass {
    public static void main(String[] args) {
        StudentReadClass studentReadClass =new StudentReadClass();
        studentReadClass.getCollege();
        StudentReadClassMainClass studentReadClassMainClass = new StudentReadClassMainClass();
//        studentReadClassMainClass.getCollege();  // error because you are making the object of this class
        // and calling another class method which is not possible
    }
}
