package Method.sum;

import Method.StringMethod;

import java.util.Scanner;

public class addition {
    static int Tosum(){
        System.out.println("Enter first number");
        Scanner in = new Scanner(System.in);
        int digit1 = in.nextInt();

        System.out.println("Enter Second number");
        int digit2 = in.nextInt();

        int result = digit1+ digit2;
        return result;
    }
    static int Tosum2(int a ,int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        int ans = Tosum()  ;
        System.out.println(ans);
        int ans2 = Tosum2(20,50);
        System.out.println(ans2);

    }
}

