import java.util.Arrays;
public class Minimum_Array {

        public static void main(String[] args) {
            int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
            twoPointerSort(arr);
            System.out.println("Sorted Array: " + Arrays.toString(arr));
        }
        public static void twoPointerSort(int[] arr) {
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                while (left < right && arr[left] <= arr[right]) {
                    left++;
                }

                while (left < right && arr[right] >= arr[left]) {
                    right--;
                }
                if (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
            }

        }
    }



