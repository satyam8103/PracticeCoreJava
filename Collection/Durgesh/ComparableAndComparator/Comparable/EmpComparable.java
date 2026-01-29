package Durgesh.ComparableAndComparator.Comparable;

public class EmpComparable implements Comparable<EmpComparable> {
    private String name;
    private String phone;
    private int EmpId;

    @Override
    public int compareTo(EmpComparable o) {
        return this.EmpId-o.EmpId;
    }
    public EmpComparable(String name, String phone, int EmpId){
        this.EmpId = EmpId;
        this.name = name;
        this.phone = phone;
    }

    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
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
}
