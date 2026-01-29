package Chatgpt;

public class ArraySort {

    public static void main(String[] args) {
        int arr[]= {34,67,23,11,77};
        int max =arr[0];
        int left =0;
        boolean ans;
        int right= arr.length-1;
       while(left<right){
           int store =left+1;
           if(max <arr[left+1]){
               ans =true;
               store++;
               if(ans == false){
                   System.out.println("not sorted");
               }
               else {
                   System.out.println("sorted");
               }
           }
       }
    }
}
