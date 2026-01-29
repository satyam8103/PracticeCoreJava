import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.println("enter the no.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag =false;
        for(int i =2 ;i<num/2;i++){
            if(num%i ==0) {
                flag = true;
                break;
            }


         }
        if(flag==true){
            System.out.print("composite");
        }
        else {
            System.out.println("no is prime");
        }
        }

    }

