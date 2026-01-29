import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        System.out.println("enter age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        Vote.voteEligible(age);
    }
    public static void voteEligible(int num){
        if(num>=18){
            System.out.println("Eligible");
        }
        else {
            System.out.println("not");
        }
    }
}
