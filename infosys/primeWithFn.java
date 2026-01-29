import java.util.Scanner;

public class primeWithFn {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1;i<num;i++){

            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        for(int i = 2;i<number;i++){
            if(number%i ==0){
                return false;
            }
        }
        return true;
    }

}
