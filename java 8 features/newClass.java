public class newClass implements myInterface{

    public static void main(String[] args) {
        myInterface i = (int a) ->{
            double store = Math.pow(10,2);
            int value = (int) store;
            return value;
        };
        System.out.println(i.newMethod(10));
        newClass newClass = new newClass();
        newClass.newMethod2();
        System.out.println(newClass.newMethod(10));

        myInterface.StaticMethod();

    }


    @Override
    public int newMethod(int a) {
        return 0;
    }
}

interface myInterface{

    public int newMethod(int a);

    default void newMethod2(){
        System.out.println("default method");
    }
    static  void StaticMethod(){
        System.out.println("Static method");
    }

}