package Week2.day2;

public class javachallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "A man, a plan, a canal:Panama";
		String temp = s;
		String low = temp.toLowerCase();
		String rep = low.replaceAll("[^a-zA-Z0-9]", "");
		String r = new StringBuffer(rep).reverse().toString();
		System.out.println(r);
		boolean result = rep.equals(r);
		if (result==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
