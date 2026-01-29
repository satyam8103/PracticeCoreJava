
public class SecretPin {

    public static int sumOfDigits(int num, boolean even) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (even && digit % 2 == 0) {
                sum = sum + digit;
            } else if (!even && digit % 2 != 0) {
                sum = sum + digit;
            }
            num /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        int input1 = 2345;
        int input2 = 5467;
        int input3 = 6789;
        int input4 = 38;
        int sum = 0;
        if (input4 % 2 == 0) {
            sum += sumOfDigits(input1, true);
            sum += sumOfDigits(input2, true);
            sum += sumOfDigits(input3, true);
            sum += sumOfDigits(input4, true);
        } else {
            sum += sumOfDigits(input1, false);
            sum += sumOfDigits(input2, false);
            sum += sumOfDigits(input3, false);
            sum += sumOfDigits(input4, false);
            }
           System.out.println(sum);
    }
}