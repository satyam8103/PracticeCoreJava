package Durgesh;
import java.util.*;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Durgesh");
        names.add("satyam");
        names.add("arpit");
        names.add("shekhar");

        // for each loop
        for(String str :names){
//            System.out.print(str +"\t" +str.length()+"\t");
            StringBuilder br = new StringBuilder(str);
//            System.out.println(br.reverse());
        }
        System.out.println("____________________________________");

        // traversing using iterator
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()){
           String next = itr.next();
            System.out.println(next);
//            System.out.println("--------------------");
        }
                    System.out.println("--------------------");
        //backward traversal
        ListIterator<String> listItr = names.listIterator(names.size());
        while(listItr.hasPrevious()){
            String previous = listItr.previous();
            System.out.println(previous);
        }

            //Enumeration is already done

        System.out.println("++++++++++FOR EACH METHOD++++++++");
        names.forEach(notEOnly->{

            // SIMILAR LIKE ARROW FUN IN JS FUNCTION INTERFACE KI IMPL PROVIDE KARTA HAI
//            System.out.println(notEOnly);
        });
        System.out.println("SORTING OF ELEMENTS ALPHABETICALLY");
        TreeSet <String>set = new TreeSet<>();
        set.addAll(names);
        set.forEach(e->{
            System.out.println(e);
        });
    }
}
