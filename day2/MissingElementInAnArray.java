package Week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int i=1;
		while( i < arr.length)
		{
		if (arr[i]-arr[i-1]==1)
		{
	}
	else
	{
		System.out.println("The Missing Number is: "+ (arr[i-1]+1));
	}
	i++;
}
}
}


