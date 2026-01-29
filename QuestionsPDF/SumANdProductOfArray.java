////public class SumANdProductOfArray {
////    public static void main(String[] args) {
////        int[] arr = {11,22,9,1,33,51,21};
////
////        //sum
////        int i;
//////        int temp = arr[i];
////        for( i = 0;i< arr.length-1;i++){
////            int temp = arr[i] ;
////            arr[temp] = arr[i]+arr[i+1];
////            arr[i+i+1] = temp;
////            System.out.println(temp);
////
////        }
////        System.out.println(arr[i]);
////
////
////
////
////    }
////}
//
//
//public class SumANdProductOfArray {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//
//        int temp = 0;
//        // Sum adjacent elements and store the result back in the array
//        for (int i = 0; i < arr.length - 1; i++) {
//            temp = arr[i];
//            while (arr[i]< arr.length) {
//                arr[i] = arr[i] + arr.length-1;
//                // Sum current and next element
//            }
//
//            System.out.println("Sum of element " + temp + " and " + arr[i + 1] + " is: " + arr[i]);
//        }
//
//        // Printing the final array (optional)
//        System.out.println("Final array after summing adjacent elements:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}
