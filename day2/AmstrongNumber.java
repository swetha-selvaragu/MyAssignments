package Week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=153;
		int calculated=0; 
	    int Reminder, Original;
	    Original=input; 
		while(Original!=0)
		{
			Reminder = Original % 10;
			calculated = calculated +Reminder*Reminder*Reminder;
		    Original= Original/10;
		   
		}
		if(calculated==input)
			System.out.println(input +" is an Armstrong");
		else
			System.out.println(input +" is not an Armstrong");
	}
}
