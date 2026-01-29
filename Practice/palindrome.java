import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int sum = 0, n,rem;
        System.out.println("Enter the No.");
        Scanner num = new Scanner(System.in);
        int input = num.nextInt();
        int temp =input;
        while(input>0){
           rem = input %10;
           sum = sum*10+rem;
           input =input/10;

        }
        if(temp ==sum){
            System.out.println("palindrome no.");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
