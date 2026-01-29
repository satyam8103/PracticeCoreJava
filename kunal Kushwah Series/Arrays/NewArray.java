import java.util.Arrays;
import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        System.out.println("Enter the Array elements");
        Scanner in  = new Scanner(System.in);
        int input = in.nextInt();

        // array of primitives
        int arr[] = new int[input];

        for (int i = 0;i< arr.length;i++){
            arr[i] = in.nextInt();
        }
//        for (int i = 0;i< arr.length;i++){
//            System.out.println(arr[i]+ " ");
//        }
////       OR or
//        for (int num:arr){
//            System.out.print(num + " ");
//        }
        // or best method generally use

        System.out.println(Arrays.toString(arr));

        //array of objects\

        System.out.println("enter the characters");
        String[] str = new String[4];
        for (int i =0;i < str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
