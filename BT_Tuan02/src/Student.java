

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return this.getName()+ "\t" + this.getId()+ "\t" + this.getGroup()+ "\t"  + this.getEmail();
    }

    public Student() {
        name = "Student";
        id = "000";
        group ="K59CD";
        email="uet@vnu.edu.vn";
    }

    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        group = "K59CD";
        this.email = email;
    }

    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group =s.getGroup();
        this.email = s.getEmail();
    }

    public Student(String group){
        this.group = group;
    }

}
