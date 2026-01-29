package Encapsulation.Account.Method;

public class Method_Understanding {
    String name;
    int age;

    public static void main(String[] args) {
//       int obj1 = new abhishek();
        Method_Understanding obj = new Method_Understanding();
        obj.abhishek();
        obj.name ="satyam";
        System.out.println(obj.name);

    }
    static void abhishek() {
        System.out.println("hhello world");
    }

}