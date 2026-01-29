package Durgesh.ComparableAndComparator.Main;
import Durgesh.ComparableAndComparator.Comparator.EmpComparator;
import Durgesh.ComparableAndComparator.Comparator.IdComparator;
import Durgesh.ComparableAndComparator.Comparator.NameComparator;
import Durgesh.ComparableAndComparator.Comparator.NameComparatorIgnoreCase;

import java.util.ArrayList;
import java.util.Collections;
public class MainClassComparator {
    public static void main(String[] args) {
        ArrayList<EmpComparator> empComparators = new ArrayList<>();
        empComparators.add(new EmpComparator("Satyam", "84893489094", 18));
        empComparators.add(new EmpComparator("shekhar", "98438930384", 55));
        empComparators.add(new EmpComparator("abhishek", "9834894389", 78));
        empComparators.add(new EmpComparator("arpit", "7823213", 28));
        empComparators.add(new EmpComparator("sagar", "8923213", 104));
        empComparators.add(new EmpComparator("pawan", "892213", 174));

        empComparators.add(new EmpComparator("Tanuj", "782783213", 22));
        empComparators.add(new EmpComparator("soumik", "9928213", 114));
        System.out.println(empComparators);

        //comparator
        Collections.sort(empComparators,new IdComparator());
        System.out.println(empComparators);
        // nameWise sorting
        ArrayList <EmpComparator> empComparators1 = new ArrayList<>(empComparators);
        Collections.sort(empComparators1,new NameComparator());
        System.out.println(empComparators1);

        ArrayList <EmpComparator> empComparators2 = new ArrayList<>(empComparators);
        Collections.sort(empComparators2,new NameComparatorIgnoreCase());
        System.out.println(empComparators2);

        // here output is come wrong of uppercase and lowercase S is capital
        // if you want your output correct
        // apply a method compareToIgnoreCase()

    }
}