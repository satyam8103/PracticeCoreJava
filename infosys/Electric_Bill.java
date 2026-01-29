import java.util.Scanner;

public class Electric_Bill {
    public static void main(String[] args) {
        System.out.println("enter the unit consumed");
        Scanner sc = new Scanner(System.in);
        int unit =  sc.nextInt();
        double bill= 0;
        if(unit<199){
            System.out.println(100);
        } else if (unit>200 && unit<400) {
            bill = unit*1.50;

            if(bill >=400 ){
                bill = bill +bill *0.15;
                System.out.println(bill);
            }
            else{
                System.out.println(bill);
            }


        } else if(unit>=400 && unit<600 ){
            bill = unit*1.80;
            if(bill >=400 ){
                bill = bill +bill *0.15;
                System.out.println(bill);
            }
        }
        else{
            bill = unit*2.00;
                bill = bill +bill *0.15;
                System.out.println(bill);

        }


    }

}
