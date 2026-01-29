import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        System.out.println("enter the size in array");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum = 0;
        String s = "satyam";
        System.out.println("enter the elements in array 1 ");
        //input array1
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the elements in array 2 ");

        for(int j = 0;j<arr.length;j++){
            arr[j] = sc.nextInt();
        }
        //access
        for(int i = 0;i< arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                sum =  arr[i] + arr[j];
                System.out.println(sum);
                break;
            }
        }

    }
}
