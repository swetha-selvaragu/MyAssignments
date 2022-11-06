package Week1.day1;

public class Mobile {
	
	public void makeCall() 
	{
		System.out.println("Make Call");
	}
	public void sendMsg()
	{
		System.out.println("Message Sent");
	}
	public static void main(String[] args)
	{
		Mobile newMobile = new Mobile();
		newMobile.makeCall();
		newMobile.sendMsg();
		
	}

}
