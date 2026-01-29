package HashMap;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapEx {

    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int arr[] = new int[size];
//        int i ;
        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
            hashMap.put(i, arr[i]);

        }
//        for (int arrPrint: arr){
//            System.out.print(arr);
//        }

//        for(int j = 0;j< arr.length;j++) {
//        }
        for(Map.Entry<Integer,Integer> k:hashMap.entrySet() ){
            System.out.println(k.getKey()+" "+ k.getValue());
        }
    }
}
