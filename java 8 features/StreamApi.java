import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {
////        Stream <Double> stream = Stream.generate(Math::random).limit(5);
////        stream.forEach(System.out::println);
//
////        List<Integer> list = Arrays.asList(1,2,3,4);
//////        Stream <Integer> stream2 = Stream.empty();
////        Stream  <Integer> stream3 = list.stream();
////
////        stream3.forEach(System.out::println);
////
////
////
////
////        for (int i = 0; i < 5; i++) {
////            double store = Math.random();
////
////            System.out.println(store);
////        }
////
////
//
////        int[] arr = {22,33,44,55,66,77};
////
////        Stream <Integer> stream = Arrays.stream(arr).boxed();
////        List<Integer> list = stream.filter(n -> n%2==0 ).collect(Collectors.toList());
////
////        list.forEach(System.out::println);
////
//
//
////        Set<Integer> set = Set.of(11,22,33,44,55,66);
////
////        Set<Integer> list = set.stream().filter(n-> n%2==0).collect(Collectors.toSet());
//
////        System.out.println(list);
//
//
////        Collections.sort(list.);
//
//        Set<Integer> set2 = Set.of(11,33,44,5,6,77,88);
//
//        List<Integer> ssort = set2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(ssort);
//
//        List<Integer>list1 = Arrays.asList(10,20,30,10,20,40);
//        List<Integer>list2 = list1.stream().distinct().collect(Collectors.toList());
//        long c =list1.stream().filter(n -> n>20).count();
//
//        System.out.println(list2);
//        System.out.println(c);
//        }
        List<String> list = Arrays.asList("satyam","subhash","Abhishek");
        list.stream().forEach(n-> System.out.println("hello " + n));


    }

    }



