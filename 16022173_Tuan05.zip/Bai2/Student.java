public class Student extends Person {
	//Lop hien tai dang hoc
	public Class currentClass;

	//Constructors
	Student() {

	}

	Student(String name, String address, String department) {
		this.name = name;
		this.address = address;
		this.department = department;
	}

	
	public void setClass(Class c) {
		currentClass = c;
	}

	//Dang ky lop hoc
	public void attendToClass(Class c) {
		c.addStudent(this);
	}

	//Kiem tra xem thuoc lop nao
	public String whatClass() {
		return currentClass.getName();
	}
}