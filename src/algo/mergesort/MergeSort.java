package algo.mergesort;

public class MergeSort
{
	
	private static int[] merge(int[] arrayToSort, int firstIndex, int middleIndex, int lastIndex)
	{
		
	}
	
	public static void sort(int[] unsortedArray)
	{
		sort(unsortedArray, 0, unsortedArray.length-1);
	}
	
	public static void sort(int[] unsortedArray, int firstIndex, int lastIndex)
	{
		if(firstIndex < lastIndex)
		{
		int middleIndex = (firstIndex + lastIndex)/2; // Middle of array
		sort(unsortedArray, firstIndex, middleIndex); // Split left side of array recursively
		sort(unsortedArray, middleIndex+1, lastIndex); // Split right side of array recursively
		merge(unsortedArray, firstIndex, middleIndex, lastIndex); // Sort and merge arrays
		}
	}
	

}
