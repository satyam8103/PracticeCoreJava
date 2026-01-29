import java.util.ArrayList;
import java.util.HashSet;

public class SortedArray {
    public static void main(String[] args) {
        int[]arr = {};
        HashSet<Integer>hashSet = new HashSet<>();
        for(int i = 0;i< arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                hashSet.add(arr[i]);

            }

        }
        System.out.println(hashSet);
    }
}
