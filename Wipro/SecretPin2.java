public class SecretPin2 {
    public static void main(String[] args) {
        SecretPin2 secretPin2 =new SecretPin2();
//        secretPin2.Even(2345,5467,6742,38);
        System.out.println(secretPin2.Even(2345,5467,6742,38));
    }
    public SecretPin2() {

    }
    public int Even(int input1, int input2, int input3, int input4){
        int sum =0;

        if(input4 %2 ==0) {
            while (input1 >0)  {
                int rem = input1 % 10;
                sum= sum+ rem;
            }
            input1 = input1/10;
        }
        return sum;

    }
}
