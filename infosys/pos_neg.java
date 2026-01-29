import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        System.out.println("enter input");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            System.out.println("positive");

        } else if (num<0) {
            System.out.println("negative");

        }
        else {
            System.out.println("zero");
        }
    }
}
