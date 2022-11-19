package Week2.day2;

public class learnstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "TestLeaf";
		String s2 = new String("TestLeaf");
		boolean isEqual = s.equals(s2);
		System.out.println(isEqual); //exactly equal
		System.out.println(s.equalsIgnoreCase(s2)); //to check only if the word is correct
		System.out.println(s == s2); 
		
		int length = s.length();//to get number of char in string
		System.out.println(length);
		
		char[] charArray = s.toCharArray(); //to convert string to array
		System.out.println(charArray[7]);
		
		char charAt = s.charAt(7); //to get a particular char
		System.out.println(charAt);
		
		char charAt2 = s.charAt(s.length()-3); //to get a particular char
		System.out.println(charAt2);
		
		int indexOf = s.indexOf("L"); // to get a position of specific char
		System.out.println(indexOf);
		
		boolean contains = s.contains("Leaf"); //to check a string contains specific word or text
		System.out.println(contains);
		
		String[] split = s.split(" "); //to split the string
	}

}
