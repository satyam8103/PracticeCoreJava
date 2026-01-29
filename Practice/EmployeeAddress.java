class Employee{
    Address address;
    public void setAddress(Address address) {
        this.address = address;
    }
}

class Address{
    String street;
    String city;
    String state;
    String pinCode;

public Address(String street,String city,String state,String pinCode){
    this.street = street;
    this.city = city;
    this.state = state;
    this.pinCode = pinCode;
}
}
public class EmployeeAddress {
    public static void main(String[] args) {
        Address address = new Address("hanuman Bajariya","sabalgarh","M.P","476229");

        Employee employee = new Employee();
        System.out.println("employee's address" + employee.address.street + ","+employee.address.city);

        Address address1 =new Address("ITM UNIVERSITY","GWALIOR","M.P","475001");
        employee.setAddress(address1);
    }


}
