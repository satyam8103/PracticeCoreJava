package LinearSearch;
import java.util.Scanner;
public class LinearSearch {
  public static void input(int refArr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the array:");

      int index;
        for (index = 0; index < refArr.length; index++) {
            refArr[index] = sc.nextInt();
        }
    }
       public static int linearSearchImpl(int[] arr,int target){
//            if(arr.length == 0){
//                return -1;
//            }
            for(int index =0;index<arr.length;index++){
                if(arr[index] == target)
                return index;
            }
            return -1;
}
        public static void main(String[] args) {
            System.out.println("Enter the size of the array");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int arr[]= new int[size];
            input(arr);
            System.out.println("Enter Elements to search");
            int target = sc.nextInt();
            int output = linearSearchImpl( arr,target);

            if(output != -1){
                System.out.println("ELEMENT " + target + " found at index " +output);
            }
            else {
                System.out.println("ELEMENT " + target + " not found in the array ");
            }
        }
    }
