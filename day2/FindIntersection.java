package Week1.day2;

public class FindIntersection {
	public static void main(String[] args)
	{
	int[] data1 = {3,2,11,4,6,7};
	int[] data2 = {1,2,8,4,9,7};
    for (int i=0; i<data1.length; i++)
    {
    	for (int j=0; j<data2.length; j++)
    	{
    		if(data1[i]==data2[j])
    		{
    			System.out.println(data2[j]);
    		}
    	}
    }
}
}