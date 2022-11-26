package Week3.day1;

public class Mobile extends AndroidPhone {
	
	public void connectWhatsapp()
	{
		System.out.println("Whatsapp connect");
	}
public static void main(String[] args)
{
	Mobile ss= new Mobile();

ss.sendMsg();
ss.makeCall();
ss.saveContact();


}
	
}
