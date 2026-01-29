package Chatgpt;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {17,11,13,34,7,55};
        int max = arr[0];
        for (int i =1;i<arr.length;i++){
            max = arr[i];
        }
        System.out.println(max);
    }

}
