import java.util.Arrays;

public class ChocolateProblem {
    public void moveZeroes(int arr[]){
        int left = 0;
        for(int right = 0 ; right<arr.length;right++) {
            if (arr[right] != 0) {
                arr[left] = arr[right];
                left++;
            }
        }
            for(int i =left;i<arr.length;i++){
                arr[i] = 0;
            }
        }
    public static void main(String[] args) {
        int arr[]= {4,6,0,3,0,1,0,1};
            ChocolateProblem obj= new ChocolateProblem();
            obj.moveZeroes(arr);
            System.out.println(Arrays.toString(arr));

    }
}
