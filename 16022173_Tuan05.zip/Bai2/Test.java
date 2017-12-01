public class Test {
	public static void main(String[] args) {
		//Tao 3 lop
		Class K61N = new Class("K61N");
		Class K61T = new Class("K61T");
		Class K61M = new Class("K61M");
		//Tao 3 giao vien
		Teacher t1 = new Teacher("Nguyen Van A", "Ha Noi", "OPPS", "TS");
		Teacher t2 = new Teacher("Nguyen Van B", "Sai Gon", "TH&HT", "TS");
		Teacher t3 = new Teacher("Le Xuan C", "Da Nang", "KTMT", "ThS");
		//Tao 5 hoc sinh
		Student s1 = new Student("Le Xuan Hieu", "Hanoi", "Student");
		Student s2 = new Student("Hieu Xuan Le", "Sai Gon", "Student");
		Student s3 = new Student("Xuan Le Hieu", "Hue", "Student");
		Student s4 = new Student("Hieu Le Xuan", "Da Nang", "Student");
		Student s5 = new Student("Xuan Hieu Le", "Ha Long", "Student");
		//Lop nhan hoc sinh, hoc sinh dang ky lop
		K61N.addStudent(s1);
		K61N.addStudent(s2);
		s3.attendToClass(K61N);
		K61M.addStudent(s4);
		s5.attendToClass(K61T);
		//Lop nhan giao vien
		K61N.addTeacher(t1);
		K61T.addTeacher(t2);
		K61M.addTeacher(t3);
		//In thong tin cac lop
		K61N.printList();
		K61T.printList();
		K61M.printList();

	}
}