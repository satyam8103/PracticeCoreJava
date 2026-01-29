package BasicProgramCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparisionCollectionMinMaxMethod2 {
    public static void main(String[] args) {
        List<Integer>numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(10);
        numbers.add(250);
        numbers.add(70);
        Collections.max(numbers);
        System.out.println(numbers);
        int min = Collections.min(numbers);
        System.out.println(min);
        int max = Collections.max(numbers);
        System.out.println(max);
    }
}
