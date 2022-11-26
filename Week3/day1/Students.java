package Week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);

	}
	public void getStudentInfo(int id , String name) {
		System.out.println(id);
		System.out.println(name);

	}
	public void getStudentInfo(String email , int phoneNumber) {
		System.out.println(email);
		System.out.println(phoneNumber);

	}
	public static void main(String[] args) {
		Students Info = new Students();
		Info.getStudentInfo(1);
		Info.getStudentInfo(1, "Swetha");
		Info.getStudentInfo("swethas180898@gmail.com", 73585111);
		
	}

}
