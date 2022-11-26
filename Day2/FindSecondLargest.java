package Week3.Day2;

import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data= {2,2,11,4,8,7,5,3,3,6,7};
		
		Set<Integer> dataSet=new TreeSet<Integer>();
		
		for(int i=0;i<data.length;i++)
			dataSet.add(data[i]);
		Object[] array = dataSet.toArray();
		System.out.println(array[array.length-2]);

	}

}
