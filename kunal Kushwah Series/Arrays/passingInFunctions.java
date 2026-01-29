import java.util.Arrays;

public class passingInFunctions {
    public static void main(String[] args) {
//        int arr[] = { 12,34,55,77};
        int[] arr = { 12,34,55,77};
        System.out.println(arr);  // will give memory address of array rather than its content
//        System.out.println(Arrays.toString(arr));
        changeNum(arr);
        System.out.println(arr);
    }
    static void changeNum(int[]num){
        num[0]= 99;
    }
}
