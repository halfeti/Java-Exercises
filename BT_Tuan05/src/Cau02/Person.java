package Cau02;

public class Person {
    private String name;
    private String address;
    private String department;

    public Person(){ }
    public Person(String name, String address, String department){
        this.name=name;
        this.address=address;
        this.department=department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void print(){
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Department: " + this.department);

    }
}
