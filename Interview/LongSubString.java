public class LongSubString {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int maxSum=0;
        for (int i = 0; i < n; i++) {
            int curSum = 0;
            for (int j = i; j < n; j++) {
                curSum+= arr[j];
                maxSum = Math.max(curSum,maxSum);
            }
        }
        System.out.println(maxSum);
    }

}
