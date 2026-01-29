import java.util.Scanner;
public class DelElemArr {
    public static void main(String[] args) {
        System.out.println("Enter the Size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int arr2[] = new int[size + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Index which you want to delete");
        //input index
        int del = sc.nextInt();
        for(int i = 0;i<arr.length;i++){   //10 20 30 40
            if(i<del){
                arr2[i] = arr[i];
            } else if (i==del)
                continue;
            else {
              arr2[i-1] =arr[i];
            }
        }
        for (int i = 0;i<size-1;i++){
            System.out.print(" "+ arr2[i]);
        }
    }
}