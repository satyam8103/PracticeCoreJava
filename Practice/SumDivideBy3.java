import java.util.Scanner;

public class SumDivideBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        if(num>9 && num<100){
            int a = num%10;
            num = num/10;

            num  = num+a;
            System.out.println("sum of "+ temp + " is " +num);
            if(num % 3==0){
                System.out.println( num + " is divisible by 3");
            }
            else  {
                System.out.println(num + " is not divisible by 3");
            }
        }
        else {
            System.out.println(num+" give only two digits ");
        }
    }
}
