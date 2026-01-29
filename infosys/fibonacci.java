import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int n1= 0,n2 =1;
        for(int i =0;i<=num;i++){
            System.out.print(n1 + " ");
            int sum = n1+n2;
            n1 =n2;
            n2 =sum;
        }
    }
}
