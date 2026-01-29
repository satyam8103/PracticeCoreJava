public class AddnoByMethodStatic {
    static int add(int a,int b){
        return  a+b;
    }
    static double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(11,55));
        System.out.println(add(11.66,55.88));
    }
}
