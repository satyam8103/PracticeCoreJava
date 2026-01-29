package BasicProgramCollection;
import java.util.*;
public class CollectionsHashsetOrStreamApi {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        for (int i = 1;i<=5;i++){
            numbers.add(i);
        }
        numbers.stream().forEach(System.out::print);
        numbers.remove(4);
        System.out.println(numbers);

//        System.out.println();
        numbers.stream().forEach(System.out::println);
        try{
//            Collections.unmodifiableCollection(numbers);
            numbers = Collections.unmodifiableSet(numbers);
            numbers.remove(4);

        }
        catch (UnsupportedOperationException unsupportedOperationException){
            System.out.println("Exception is "+unsupportedOperationException);
            System.out.println("now set is read only");

        }
        finally {
            System.out.println("number contains :" + numbers.contains(3));
            System.out.println("number contains :" + numbers.contains(4));
            System.out.println(numbers.remove(1));
            System.out.println("now set is read only");

        }
    }
}
