package Chatgpt;
public class IsArraySortNormal {
    public static boolean ArraySortM(int[]arr){
        for(int i =1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {45,86,78,90};
        System.out.println(ArraySortM(arr));
    }
}
