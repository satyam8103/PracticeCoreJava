import java.util.Scanner;

public class SumOfSmallestDigits {
    public static void main(String[] args) {
        System.out.println("enter three numbers");
        Scanner sc = new Scanner(System.in);
        int input1 =  sc.nextInt();
        int input2 =  sc.nextInt();
        int input3 =  sc.nextInt();

        int smallest = input1;
        if(input2<smallest){
            smallest = input2;
        }
        if (input3<smallest){
            smallest = input3;
        }
        int smallestSum = 0;
        int temp = smallest;
        while (temp>0){
            smallestSum +=temp%10;
            temp/=10;
        }

        temp = input1;
        int largestDigitSum1 = 0;
        while (temp>0){
            largestDigitSum1 += temp%10;
            temp/=10;
        }
        temp = input2;
        int largestDigitSum2 =0;
        while (temp>0){
            largestDigitSum2 += temp%10;
            temp/=10;
        }

        temp = input3;
        int largestDigitSum3 =0;
        while (temp>0){
            largestDigitSum3 += temp%10;
            temp/=10;
        }

        int totalLargestDigitSum = largestDigitSum1 + largestDigitSum2 + largestDigitSum3;

        int diff = totalLargestDigitSum - smallestSum;

        System.out.println("answer " + diff);
    }
}
//3521
//2452
//1352