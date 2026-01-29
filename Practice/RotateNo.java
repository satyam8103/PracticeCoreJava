public class RotateNo {
    public static void main(String[] args) {
        int num=562984;
        int k =3;
        int rot=0;
        for(int i = 0;i<k;i++){
            rot = (int) Math.pow(10,k);
        }
//        System.out.println(rot);
        int rem = 0;
        while(num>0){
         rem = num%rot;
        num = num/rot;
            System.out.print(rem);
            System.out.println(num);
            break;

        }
//        System.out.print(rem);

    }
}
