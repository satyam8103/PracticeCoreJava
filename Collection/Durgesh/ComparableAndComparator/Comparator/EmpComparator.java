package Durgesh.ComparableAndComparator.Comparator;

public class EmpComparator  {
    private String name;
    private String phone;
    private int EmpId;

//    @Override
    public int compare(EmpComparator o1, EmpComparator o2) {
        return o1.getEmpId()-o2.getEmpId();
    }

    public EmpComparator(String name, String phone, int empId) {
        this.name = name;
        this.phone = phone;
        EmpId = empId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getEmpId() {
        return EmpId;
    }

    @Override
    public String toString() {
        return "EmpComparator{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", EmpId=" + EmpId +
                '}';
    }

    //
}
