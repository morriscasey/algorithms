package algo.mergesort;

public class MergeSort
{
	
	private static void merge(int[] arrayToSort, int firstIndex, int middleIndex, int lastIndex)
	{
		int tempArray[] = new int[lastIndex - firstIndex + 1];
		
		int leftIndex = firstIndex; // Index counter for left side of array
		int rightIndex = middleIndex + 1; // Index counter for right side of array
		int counter = 0;
		
		while(leftIndex <= middleIndex && rightIndex <= lastIndex)
		{

		
			if(arrayToSort[leftIndex] < arrayToSort[rightIndex])
			{
				tempArray[counter] = arrayToSort[leftIndex];
				leftIndex++;
			}
			else
			{
				tempArray[counter] = arrayToSort[rightIndex];
				rightIndex++;
			}
			counter++;
		}
		
		// Left and right sub-array is sorted
		if(leftIndex <= middleIndex)
		{
			while(leftIndex <= middleIndex)
			{
				tempArray[counter] = arrayToSort[leftIndex];
				leftIndex++;
				counter++;
			}
		}
		else if(rightIndex <= lastIndex)
		{
			while(rightIndex <= lastIndex)
			{	
				tempArray[counter] = arrayToSort[rightIndex];
				rightIndex++;
				counter++;
			}
		}

		// Load back into arrayToSort
		for(int i  = 0; i< tempArray.length; i++)
		{
			arrayToSort[firstIndex + i] = tempArray[i];
		}
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
