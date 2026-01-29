import java.util.Scanner;

public class Even_oddFn {
    public static void main(String[] args) {
//        System.out.println("enter number");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

//        Even_oddFn evenOddFn = new Even_oddFn();
        Even_oddFn.Even(6);
//        int result = Even(6);
//        System.out.println(result);
    }
    public static void Even(int num){
        if(num % 2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }

    }


}
