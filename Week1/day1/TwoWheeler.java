package Week1.day1;

public class TwoWheeler {
	
	public int noOfWheels=2;
	public short noOfmirrors=3;
	public long chassisnumber=656780876;
	public boolean isPunctured=true;
	public String bikeName="Yamaha Alpha";
	public double runningKM=1123.345;
	
	public static void main(String[] args)
	{
		TwoWheeler Yamaha = new TwoWheeler();
		System.out.println(Yamaha.noOfWheels);
		System.out.println(Yamaha.noOfmirrors);
		System.out.println(Yamaha.chassisnumber);
		System.out.println(Yamaha.isPunctured);
		System.out.println(Yamaha.bikeName);
		System.out.println(Yamaha.runningKM);
	}
}
