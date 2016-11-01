package algo.mergesort;

public class MergeSort
{
	private static int tempArray[];
	public static void sort(int[] unsortedArray)
	{
		tempArray = new int[unsortedArray.length];
		sort(unsortedArray, 0, unsortedArray.length-1);
	}
	
	public static void sort(int[] unsortedArray, int firstIndex, int lastIndex)
	{
		if(firstIndex < lastIndex)
		{
			int middleIndex = (firstIndex + lastIndex)/2; // Middle of array
			sort(unsortedArray, firstIndex, middleIndex); // Split left side of array recursively
			sort(unsortedArray, middleIndex+1, lastIndex); // Split right side of array recursively
			mergeInPlace(unsortedArray, firstIndex, middleIndex, lastIndex); // Sort and merge arrays
		}
	}
	
	/* Previous merge method
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
	**/
	public static void mergeInPlace(int unsortedArray[], int start, int mid, int end)
	{
		int i = start; // Saves starting index of left side of array
		int j = mid+1; // Saves starting index of right side of array
		
		// Copies data from unsorted array to temp array
		for(int counter = 0; counter <= end;counter++)
		{
			tempArray[counter] = unsortedArray[counter];
		}
		
		for(int counter = start; counter <= end;counter++)
		{
			if(i > mid)
			{
				unsortedArray[counter] = tempArray[j];
				j++;
			} 
			else if(j > end)
			{
				unsortedArray[counter] = tempArray[i];
				i++;
			}
			else if(tempArray[j] < tempArray[i])
			{
				unsortedArray[counter] = tempArray[j];
				j++;
			}
			else
			{
				unsortedArray[counter] = tempArray[i];
				i++;
			}
		}
	}
	

}
