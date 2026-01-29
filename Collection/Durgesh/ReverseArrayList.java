package Durgesh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
public class ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(240);
//        list.addFirst(90);
        System.out.println(list);
//        ListIterator listItr = list.listIterator();
//        while(listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
        ListIterator listItr2 = list.listIterator(list.size());
        System.out.print("List Elements are");
        while (listItr2.hasPrevious()){
            System.out.print( " "+ listItr2.previous());
        }

        Collections.reverse(list);
//        System.out.println(list);
    }
}
