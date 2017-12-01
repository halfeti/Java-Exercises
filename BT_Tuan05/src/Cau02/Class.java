package Cau02;

public class Class {
    private String name;
    private static int numberOfStudents=0;
    private Teacher advisor;
    private Student[] studentList;
    public void printList(){
        for(int i =0; i<numberOfStudents; i++){
            System.out.println();
        }
    }
}
