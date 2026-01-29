package Durgesh;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Double>hashSet = new HashSet<>();
        hashSet.add(14.14); // autoboxing ho rahi hai because input is primitive
        //and we have defined obj type input
        hashSet.add(14.14);
        hashSet.add(34.2);
        hashSet.add(new Double(56907.3));
        hashSet.add(99.3);
        System.out.println(hashSet); // order is not preserved
        // duplicates are not allowed
        // hashset does not have extra methods like list
        // it has only collections methods

        TreeSet<Double>treeSet = new TreeSet<>(); // elements prints in ascending order
        treeSet.addAll(hashSet);
        System.out.println(treeSet);
    }
}
