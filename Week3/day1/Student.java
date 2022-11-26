package Week3.day1;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("swetha");
	}
	public void studentDept() {
		System.out.println("BE");
	}
	public void studentId() {
		System.out.println("6290");
	}
	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}
}
