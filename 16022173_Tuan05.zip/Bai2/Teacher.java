public class Teacher extends Person {
	public String rank;

	//Constructors
	Teacher() {
	}

	Teacher(String rank) {
		this.rank = rank;
	}

	Teacher(String name, String address, String department, String rank) {
		this.name = name;
		this.address = address;
		this.department = department;
		this.rank = rank;
	}

	
	//Getter and Setter
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
}