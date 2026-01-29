import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        int ans = 0;
        System.out.println("what operation you want to perform");
        System.out.println("Check even odd");
        System.out.println("Check palindrome number or not");
        System.out.println("armstrong number or not");
        System.out.println("reverse number or not");
        System.out.println("select number 1 to 4 according to operation you want to perform");
//        int choice =4;
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                if(num%2 == 0){
                    System.out.println(num + " is even");
                }
                else {
                    System.out.println(num + " is odd");
                }
                break;
            case 2:
                while(num>0){
                    int rem = num%10;

                    rev = rev *10+rem;
                    num = num/10;
                }
                if(temp  == rev ){
                    System.out.println("number is palindrome");
                }
                else {
                    System.out.println("number is not palindrome");
                }
                break;
            case 3:
                while (num>0){
                    int rem = num%10;
                    ans = rem*rem*rem+ ans;
                    num = num/10;
                }
                if(temp == ans ){
                    System.out.println("Number is armstrong");
                }
                else {
                    System.out.println("Number is not armstrong");
                }

                break;
            case 4:
                while(num>0) {
                    int rem = num % 10;
                    rev = rev * 10 + rem;
                    num = num / 10;
                }
                System.out.println("reverse no. is " + rev);
                break;
        }

    }
}
