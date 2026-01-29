public class SecondMax {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int []arr = {1,-2,-3,-4};
//                int []arr = {1,2,3,4};
        int secondMax = Integer.MIN_VALUE;
        int i;
        for(i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println(max);
        for(int j =0;j<arr.length;j++){
            if(arr[j]> secondMax && arr[j]<max){
                secondMax = arr[j];
            }
        }

        System.out.println(secondMax);
    }
}
