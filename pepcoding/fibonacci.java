import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
    public static int fibo(int n , int m[]){
        if (n <= 1) {
            return n;
        }
        if(m[n]!=-1){
            return m[n];
        }
        return m[n]= fibo(n-1,m)+fibo(n-2 ,m);
    }
    public static void main(String[] args) {
  int n =7;
  int arr[] = new int [n+1];
        Arrays.fill(arr,-1);
        System.out.println(fibo(n , arr));
    }
}





//        System.out.println("Enter the value");
//Scanner sc = new Scanner(System.in);
//int num = sc.nextInt();
//int m=0;
//int n =1;
//
//        for(int i = 0;i<num;i++){
//
//        System.out.print(m+" ");
//int c = m+n;
//m= n;
//n =c;
//        }