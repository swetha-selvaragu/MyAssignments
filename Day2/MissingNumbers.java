package Week3.Day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {

	public static void main(String[] args) {
		
		int[] input= {5,3,5,2,1,2,4,6,7,4,10,9};
		
		Set<Integer> numSet= new TreeSet<Integer>();
		
		for(int i=0;i<input.length;i++)
			numSet.add(input[i]);

		System.out.println(numSet);

		int missingNum=1;
		
		for (Integer integer : numSet) {
			
			if(integer!=missingNum++)
			{
				System.out.println("Missing Number is: "+(missingNum-1));
				break;
			}
			
		}
		
	}

}