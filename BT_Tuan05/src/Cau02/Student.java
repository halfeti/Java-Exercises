package Cau02;

public class Student extends Person {
    private String group;

    public Student(String name, String address, String department){
        this.name=name;
        this.address=address;
        this.department=department;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
