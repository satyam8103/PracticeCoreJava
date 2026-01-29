package Wipro.Loops;

import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        SmallestDivisor smallestDivisor = new SmallestDivisor();
//        smallestDivisor.LogicImpl(num);
//        System.out.println(smallestDivisor.LogicImpl(num));
        smallestDivisor.LogicImpl(num);
    }
    public void LogicImpl(int num){
        for(int i = 2;i<=num;i++){
            if(num%i == 0){
                System.out.println(i);
                break;
            }

        }
//        return t
    }
}
