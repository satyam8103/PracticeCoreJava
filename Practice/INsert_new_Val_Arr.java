import java.util.Scanner;
public class INsert_new_Val_Arr {
    public static void main(String[] args) {
        System.out.println("Enter the Size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];
        int arr2[]= new int[size+1];
        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Index of new value to be inserted");
        //input index
        int index  = sc.nextInt();
        System.out.println("Enter Value");
        int value = sc.nextInt();
        for(int i = 0; i < size+1; i++){ // 10 20 30 40 50
            if(i<index){                 //10 20 80 30 40 50
              arr2[i] = arr[i];
            }
            else if(i==index){
                arr2[i] = value;
            }
            else {
                arr2[i] = arr[i-1];
            }
        }

        System.out.println("New Array");
        for(int i = 0;i<size+1;i++){
            System.out.println(arr2[i]);
        }

        System.out.println("Original Array");
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
