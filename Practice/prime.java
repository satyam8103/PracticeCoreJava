import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int count=0;
        Scanner input=new Scanner(System.in);
        int enter= input.nextInt();
        for (int i=2;i<=enter;i++){
            if(enter%i==0){
                count++;
            }
        }
        if(count>1){
            System.out.println("composite");
        }
        else{
            System.out.println("Prime");
        }
    }

}
