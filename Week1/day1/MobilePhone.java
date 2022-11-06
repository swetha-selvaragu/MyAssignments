package Week1.day1;

public class MobilePhone {
	
	public String MobileBrandName="iPhone"; 
	public char MobileLogo='8';
	public short NoOfMobilePiece=40;
	public int ModelNumber=12;
	public long MobileNumber=984534526;
	public float MobilePrice=150000;
	public boolean IsDamaged=false;
	
	public static void main(String[] args)
	{
		MobilePhone Mob = new MobilePhone();
		System.out.println(Mob.MobileBrandName);
		System.out.println(Mob.MobileLogo);
		System.out.println(Mob.NoOfMobilePiece);
		System.out.println(Mob.ModelNumber);
		System.out.println(Mob.MobileNumber);
		System.out.println(Mob.MobilePrice);
		System.out.println(Mob.IsDamaged);
	}

}
