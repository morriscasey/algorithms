package algo.binarysearch;

public class App
{

	public static void main(String[] args)
	{
		int[] testArray = {1,11,23,45,100,244,300};
		// Index should return 1
		System.out.println(binarySearch(11, testArray));
		// Index should return -1
		System.out.println(binarySearch(500, testArray));
		

	}
	
	public static int binarySearch(int valueToFind, int[] sortedArray)
	{
		int startOfRange = 0;
		int endOfRange = sortedArray.length -1;
		
		while(startOfRange <= endOfRange)
		{
			// Find mid point
			int middleOfRange = (startOfRange + endOfRange)/2; 
			
			// Middle of range is where the value is found or not
			if(sortedArray[middleOfRange] == valueToFind) 
			{
				return middleOfRange;
			}
			
			// if value to find is smaller than move end of range to the left of middle of range
			if(valueToFind < sortedArray[middleOfRange]) 
			{
				endOfRange = middleOfRange - 1;
			}
			else
			{
				startOfRange = middleOfRange + 1;
			}
		}
		return -1; // If never found returns -1
	}

}
