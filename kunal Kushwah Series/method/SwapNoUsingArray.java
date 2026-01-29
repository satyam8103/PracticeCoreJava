import Method.SwapNo;

public class SwapNoUsingArray {
    public static void main(String[] args) {

      int[] arr = {23,34};
        SwapNum(arr);
        System.out.println(arr[0]+" "+arr[1]);
    }
    static int SwapNum(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1]= temp;
        return temp;
    }
}
