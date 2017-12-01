import java.util.ArrayList;

public class StudentManagement {
    public static void main(String[] args) {
        Student student;
        student = new Student("Nguyen Thi Thuy Nga", "16021617", "K61N", "halfeti10.1@gmail.com");

        Student student2 = new Student();
        Student student3 = new Student("Nguyen Thi Thuy Nga", "16021617", "halfeti10.1@gmail.com");
        Student student4 = new Student(student);

        System.out.println("Name:" + student.getName());
        System.out.println("Student Information:\n" + student.getInfo());

        System.out.println("3 Students:");
        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());
        System.out.println(student.getInfo());

        Student sv1 = new Student(  "K59CB");
        Student sv2 = new Student(  "K59CD");
        System.out.println("Check sameGroup?");
        System.out.println(sameGroup(sv1, sv2));

        StudentManagement management = new StudentManagement();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        ArrayList< Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("Sap xep sinh vien theo lop:");
        management.studentsByGroup(students);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        management.removeStudent("16021617", students);
        for(Student c : students) {
            System.out.println(c.getInfo());
        }


    }
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup() == s2.getGroup();
    }
    public void studentsByGroup(ArrayList<Student> arrayList) {
        System.out.println("K61N");
        for(int i = 0; i< arrayList.size(); i++) {
            if(arrayList.get(i).getGroup().equals("K61N")) {
                System.out.println(arrayList.get(i).getInfo());
            }
        }
        System.out.println("-----");
        System.out.println("k59CD");
        for(int i = 0; i< arrayList.size(); i++) {
            if(arrayList.get(i).getGroup().equals("K59CD")) {
                System.out.println(arrayList.get(i).getInfo());
            }
        }

    }
    public void removeStudent(String id, ArrayList<Student> arrayList) {
        for(int i=0 ; i< arrayList.size(); i++) {
            if(arrayList.get(i).getId().equals(id)) {
                arrayList.remove(arrayList.get(i));
                i--;
            }
        }
    }


}

