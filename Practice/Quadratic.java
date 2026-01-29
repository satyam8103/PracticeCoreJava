import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        double a = sc.nextDouble();
        System.out.println("enter b");
        double b = sc.nextDouble();
        System.out.println("enter c");
        double c = sc.nextDouble();
        double result =  (b*b- 4.0 * a*c);

        if(result> 0.0){
            double r1 = -b+(Math.pow(result,0.5)/2.0);
            double r2 = -b-(Math.pow(result,0.5)/2.0);
            System.out.println("the roots are " + r1 + " and " + r2);
        }
        else {
            System.out.println("The equation has no real roots.");

        }
        //apply formula

    }
}
