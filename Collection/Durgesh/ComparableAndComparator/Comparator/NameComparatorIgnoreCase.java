package Durgesh.ComparableAndComparator.Comparator;

import java.util.Comparator;

public class NameComparatorIgnoreCase implements Comparator <EmpComparator>{
    @Override
    public int compare(EmpComparator o1, EmpComparator o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
