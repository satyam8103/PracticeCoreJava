package BasicProgramCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparisionCollectionMinMax {
    public static void main(String[] args) {
        List<Integer>list =new ArrayList<>();
        list.add(20);
        list.add(23);
        list.add(56);
        Collections.sort(list);
        System.out.println("minimum Element in the list "+ list.get(0));
        System.out.println("maximum element is"+ list.getLast());
    }
}
