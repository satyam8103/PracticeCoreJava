public class Scope {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        {
//            int a  =10; already initialized  outside the block in the same method,hence you cannot initialize again, but you can change the value.
            a =90;    //reassign the origin ref variable to some other value.
            int c = 87;
            //values initialized in this block will remain in block
        }
        System.out.println(a);
//        System.out.println(c);
    }
}
