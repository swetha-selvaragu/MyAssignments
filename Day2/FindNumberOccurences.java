package Week3.Day2;

import java.util.TreeMap;
import java.util.Map;

public class FindNumberOccurences {

	public static void main(String[] args) {
		
		int[] input= {1,3,4,6,5,2,1,5,2,1,6,-1};
		
		Map<Integer, Integer> numOccurence=new TreeMap<Integer, Integer>();
		
		for(int i=0;i<input.length;i++) {
		
			if(numOccurence.containsKey(input[i]))
			{
				int value=numOccurence.get(input[i]);
				numOccurence.put(input[i],value+1);
			}
			else {
				numOccurence.put(input[i],1);
			}
		}
		System.out.println(numOccurence);
		

	}

}
