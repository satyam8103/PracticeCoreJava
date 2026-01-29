import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] args) {
        System.out.println("Enter any number");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        boolean flag = false;
        int i;
        int j;
        for( i =2;i<=50;i++){
            int count =0;
            for( j=1;j<=i;j++){
                if(i%j==0){
                    count++;
//                    break;
                }
            }
            if(count==2){
                System.out.print(i +" ");
            }
        }

    }
}
