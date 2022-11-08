package Week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=8;
		int FirstTerm= 0;
		int SecondTerm= 1;
		int i=1;
		while (i<=n)
		{
		System.out.print(FirstTerm +" ");
	    int Sum = FirstTerm + SecondTerm;
		FirstTerm=SecondTerm;
		SecondTerm = Sum;
		i++;
		
		}
		
		
		
	}

}
