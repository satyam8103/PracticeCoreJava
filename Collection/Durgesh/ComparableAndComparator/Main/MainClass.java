package Durgesh.ComparableAndComparator.Main;

import Durgesh.ComparableAndComparator.Comparable.EmpComparable;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<EmpComparable> empComparables = new ArrayList<>();
        empComparables.add(new EmpComparable("Satyam","84893489094",18));
        empComparables.add(new EmpComparable("shekhar","98438930384",55));
        empComparables.add(new EmpComparable("abhishek","9834894389",78));
        empComparables.add(new EmpComparable("arpit","7823213",28));
        System.out.println(empComparables);
        Collections.sort(empComparables);
        System.out.println(empComparables);
        //comparable
    }
}
