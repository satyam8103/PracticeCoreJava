import java.util.Scanner;

public class vow_cons_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
        if(ch == 'a'|| ch == 'i'||ch == 'e'||ch == 'o'||ch == 'u'){
            System.out.println("vowel");
        }
else{
            System.out.println("not vowel");
        }
    }
}