import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number");
        int num = sc.nextInt();
        System.out.println("enter power");
        int pow = sc.nextInt();
        int ans = 1;

        for(int i =0 ;i<pow;i++){
             ans  = ans*num;
        }

        System.out.println(ans);
    }
}
