public class PinCode {
   public static int getEvenSum(int num){
       int temp = num;
       int sum=0;
       while(temp>0){
           int rem = temp%10;
           if(rem % 2==0){
               sum+=rem;
           }
           temp/=10;
       }
       return sum;
   }
   public  static int getOddSum(int num){
       int temp = num;
       int sum=0;
       while(temp>0){
           int rem = temp%10;
           if(rem % 2!=0){
               sum+=rem;
           }
           temp/=10;
       }
       return sum;
   }

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452 ;
        int input3 =1352  ;
        int input4 = 38;

        if(input4%2==0){
            System.out.println(getEvenSum(input1) + getEvenSum(input2) + getEvenSum(input3));
        }
        else{
            System.out.println(getOddSum(input1) + getOddSum(input2) +getOddSum(input3));
        }

    }
}