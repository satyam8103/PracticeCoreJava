import java.util.Scanner;

public class prime_no {

    public static void main(String[] args) {
        System.out.println("Enter the input");
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        int[] store ={};
        int i;
        for(i =2;i<num;i++){
            if(num%i==0){
                System.out.println("not prime");
                flag = true;
                break;
            }

        }
        for(int j = 2;j<i;j++){

            System.out.println(j);
        }
            if(!flag){
                    for(int k =2;i<num;k++){
                        if(num%k!=0){
                            System.out.println(k);

                        }

                    }
                System.out.println("prime");

            }

    }
}
