package Week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[] = {3,2,11,4,6,7};
		
		int noOfData= data.length;
		
		Arrays.sort(data);
		
		int result = data [noOfData-2];
		
		System.out.println("The Second largest number is: " +result);
		
	}

}
