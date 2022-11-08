package Week1.day2;

public class MyCalculator {
	
	public static void main(String[] args)
	{
		Calculator Res = new Calculator();
		
		int sum = Res.sum(10,21,5);
		int sub = Res.sub(10,25);
		double mul = Res.mul(24.5,28.3);
		float div = Res.div(10.5f,2.3f);
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}

}
