package Chatgpt;

import java.util.Scanner;

public class MaxArrayFun {
    public static void main(String[] args) {
//        System.out.println("enter the elements in array");
//        Scanner sc = new Scanner(System.in);
//        int num= sc.nextInt();
//        int arr[] = new int[5];
        int[] arr = {17,11,13,34,7,55};
        MaxArrayFun maxArrayFun = new MaxArrayFun();
        maxArrayFun.ArrayPrint(arr);
//        System.out.println();
        System.out.println(maxArrayFun.ArrayPrint(arr));
    }

    public int ArrayPrint(int[] num){
//        Scanner sc=new Scanner(System.in);
//        int num2= sc.nextInt();
          int max =0;

        for(int i =0;i< num.length;i++){
            max= num[0];
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;
    }
}
