import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(34,679,992,1,3,4,6,7);
        fun2("satyam","siddhi","manoj","naman");
        multiple(23,56,"manish","Arpit","shekhar");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun2(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String ...v){
        System.out.println();
    }
//    static void multiple2(int a,int... b,String ...v){ //error give because variable arg should be in last
//        System.out.println();
//    }
}
