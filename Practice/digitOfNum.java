public class digitOfNum {
    public static void main(String[] args) {
        int num =56373;
        int rev= 0;
        int rev2=0;
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        while(rev>0){
            int r = rev%10;
            System.out.println(r);
            rev2 = rev2*r;
            rev=rev/10;
        }
//        System.out.print(rem);
    }
}
