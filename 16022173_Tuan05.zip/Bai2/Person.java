public class Person {
	//cac thuoc tinh cua Person
	protected String name;
	protected String address;
	protected String department;

	
	//Constructors
	Person() {
	}

	Person(String name, String address, String department) {
		this.name = name;
		this.address = address;
		this.department = department;
	}

	//Setter and getter
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAdress(String address) {
		this.address = address ;
	}
	public String getAdress() {
		return this.address;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return this.department;
	}


	//In thong tin
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Adress: " + address);
		System.out.println("Department: " + department);
	}
}