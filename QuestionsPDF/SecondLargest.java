import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        System.out.println("Enter the size of Array ");
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();

        }

        for(int i = 0;i< arr.length;i++){
//            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int j;
        int max =arr[0];
        for(j = 0;j< arr.length;j++) {
            if(arr[j]>max){
                max = arr[j];
            }

        }
        System.out.println(max);

        int secondMax  = Integer.MIN_VALUE;
        for(int k = 0 ;k<arr.length;k++){
            if(arr[k] > secondMax && arr[k] < max){
                secondMax= arr[k];
            }
        }
        System.out.println(secondMax);
    }

}
