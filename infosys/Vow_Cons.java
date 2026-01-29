import java.util.Scanner;

public class Vow_Cons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.equals("a")|| str.equals("e")|| str.equals("i")||str.equals("o")||str.equals("u")){
            System.out.println("vowel");
        }
        else{
            System.out.println("not vowel");
        }
    }
}
