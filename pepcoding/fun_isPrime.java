import java.util.Scanner;
public class fun_isPrime {
        public static void main(String[] args) {
            Scanner scn  = new Scanner(System.in);
            int num = scn.nextInt();
//            isPrime(num);
            System.out.println(isPrime(num));
        }
        public static String isPrime(int in){
            int count = 0;
            for(int i = 1 ;i<=in;i++){
                if(in%i==0){
                    count++;
                }
            }
            if(count ==2){
//                System.out.println("prime");
                return "prime";
            }
//            else{
////                System.out.println("not prime");
//                return "not prime";
//            }
        return "no prime";
        }
    }

