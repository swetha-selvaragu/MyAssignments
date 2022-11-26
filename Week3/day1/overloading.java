package Week3.day1;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloading load = new overloading();
		load.add(5,2);
		load.add1(34,10,13);
		load.sub(6,3);
		load.sub1(5.5,2);
		load.mul(5,2);
		load.mul1(5.43,2,5);
		
		
	}
public void add (int f1, int s1)
{
System.out.println(f1+s1);	
}
public void add1 (int f2, int s2, int s0)
{
System.out.println(f2+s2+s0);	
}
public void sub (int f3, int s3)
{
System.out.println(f3-s3);
}
public void sub1 (double f4, int s4)
{
System.out.println(f4-s4);	
}
public void mul (int f5, int s5)
{
System.out.println(f5*s5);	
}
public void mul1 (double f1, int s1, int s9)
{
System.out.println(f1*s1*s9);	
}
}
