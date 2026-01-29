import java.util.Scanner;

public class NoDivisibleBy8 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 999) {
                int a = num % 10;
                num = num / 10;
                int b = num%10;
                num = num/10;
                int c = num%10;

                int ans = c*100 + b*10 + a;
                if (ans % 8 == 0) {
                    System.out.println("num is divisible by 8");
                }
                else {
                    System.out.println("num is not  divisible by 8");
                }

            }
        else {
            System.out.println("num is not valid");
        }

        }

    }
