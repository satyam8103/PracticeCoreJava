package Chatgpt;

import java.util.Scanner;

public class MaxArrayFunUser {
    public static void main(String[] args) {
        System.out.println("enter the 5 elements in array");
        int[] arr = new int[5];
        MaxArrayFunUser maxArrayFun2 = new MaxArrayFunUser();
        System.out.println(maxArrayFun2.ArrayPrint(arr));
    }
    public int ArrayPrint(int[] num){
        int max =num[0];
        for(int i =0;i< num.length;i++){
            Scanner sc = new Scanner(System.in);
            num[i] = sc.nextInt();
        }
        for(int j = 1;j< num.length;j++){

            if(num[j]>max){
                max = num[j];
            }
        }
        return max;
    }
}
