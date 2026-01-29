package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int singleNum = 0;
        for (int num : nums) {
            singleNum = singleNum ^ num;
        }
        return singleNum;

    }

    //
    public static void main(String[] args) {
        SingleNumber singleNumberM = new SingleNumber();
        int[] input = {4, 1, 3, 1, 3};
        int single = singleNumberM.singleNumber(input);
        System.out.println("the single number is " + single);
    }
}
////  int[] nums = {4, 1, 2, 1, 2};
//public class SingleNumber {
//    public int singleNumber(int[] nums) {
//        if (nums.length == 1) return nums[0];
//        Set<Integer> set = new HashSet<>();
//        for(int i =0;i<nums.length;i++){
//            if(set.contains(nums[i])){
//                set.remove(nums[i]);
//            }
//            else {
//                set.add(nums[i]);
//            }
//        }
//        return set.iterator().next();
//    }
//
//
//        public static void main (String[]args){
//            SingleNumber singleNumberM = new SingleNumber();
//            int[] input = {4, 1, 3, 1, 2};
//            int single = singleNumberM.singleNumber(input);
//            System.out.println("the single number is " + single);
//        }
//
//
//}
//

//package Leetcode;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class SingleNumber {
//    public int[] singleNumbers(int[] nums) {
//        if (nums.length == 0) {
//            throw new IllegalArgumentException("Input array cannot be empty.");
//        }
//
//        Set<Integer> set = new HashSet<>();
//        int[] result = new int[2]; // Assuming at most two unique elements
//        int count = 0;
//
//        for (int num : nums) {
//            if (set.contains(num)) {
//                continue; // Skip duplicates
//            }
//            if (count >= 2) {
//                throw new IllegalArgumentException("Input array has more than two unique elements.");
//            }
//            set.add(num);
//            result[count++] = num;
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        SingleNumber singleNumberM = new SingleNumber();
//        int[] input = {4, 1, 3, 1, 2};
//        int[] singles = singleNumberM.singleNumbers(input);
//
//        if (singles.length == 1) {
//            System.out.println("The single number is: " + singles[0]);
//        } else {
//            System.out.println("The unique numbers are: " + singles[0] + " and " + singles[1]);
//        }
//    }
//}


// if(x != 0 && x % 10 == 0)return false;