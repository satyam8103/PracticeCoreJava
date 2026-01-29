import java.lang.FunctionalInterface;

public class FunInterface {
    public static void main(String[] args) {

//        FunInterface funInterface = new FunInterface();

        funInter i = () ->{
            System.out.println("Anonymous method");
            return 1;
        };
        System.out.println(i.newMethod());
    }

}

@FunctionalInterface
interface funInter {

    public abstract int newMethod();

}