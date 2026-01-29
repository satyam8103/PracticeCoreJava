package Method;
import java.util.Scanner;
public class StringNamePrint {
   static String myGreet(String name){
        String message = "hello "+ name;
        return message;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name1= in.next();
        String name2= myGreet(name1);
        System.out.println(name2);
        String name = myGreet("satyam");
        System.out.println(name);
    }
}
