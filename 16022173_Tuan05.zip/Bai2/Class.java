public class Class {
	//Ten Lop
	private String name;
	//Danh sach hoc sinh
	private Student[] studentList = new Student[30];
	//So hoc sinh
	private int numOfStudent;
	//GVCN
	private Teacher advisor;


	//Constructors
	Class() {

	}

	Class(String n) {
		name = n;
		numOfStudent = 0;
	}

	
	//Setter and Getter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public int getNumOfStudent() {
		return numOfStudent;
	}

	
	//Them 1 hoc sinh vao lop
	public void addStudent(Student s) {
		//Kiem tra neu lop day
		if (numOfStudent == 30)
			System.out.println("Lop day, khong the them hoc sinh!");
		else {
			//Them hoc sinh
			studentList[numOfStudent] = s;
			//Them lop vao class Student
			studentList[numOfStudent].setClass(this);
			numOfStudent++;
		}
	}

	//Them Giao vien
	public void addTeacher(Teacher teacher) {
		advisor = teacher;
	}
	//In thong tin cua lop
	public void printList() {
		System.out.println("-------------------");
		System.out.println("Ten lop: " + name);
		System.out.println("So hoc sinh: " + numOfStudent);
		System.out.println("Giao vien: " + advisor.getName());
		
		//Kiem tra neu lop trong	
		if (numOfStudent == 0)
			System.out.println("Lop chua co hoc sinh nao!");
		else {
			System.out.println("Danh sach hoc sinh: ");
			for (int i = 0; i < numOfStudent; i++) {
				System.out.printf("*  %d. %s\n", i + 1, studentList[i].getName());
			}			
		}

	}
	
}