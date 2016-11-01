package algo.quicksort;

public class QuickSort
{
	public static void sort(int[] unsortedArray)
	{
		quickSort(unsortedArray, 0, unsortedArray.length-1);
	}
	private static int[] quickSort(int[] unsortedArray, int first, int last)
	{
		if(first < last)
		{
			int mid = partition(unsortedArray, first, last);
			quickSort(unsortedArray, first, mid-1);
			quickSort(unsortedArray, mid+1, last);
		}
		return unsortedArray;
	}
	
	private static int partition(int[] unsortedArray, int first, int last)
	{
		int pivotValue = unsortedArray[last]; // Last value in the array used as pivot point
		int currentIndex = first -1;
		
		for(int counter = first; counter < last; counter++)
		{
			if(unsortedArray[counter] <= pivotValue)
			{
				currentIndex++;
				// Swaps values from unsortedArray[currentIndex] with unsortedArray[counter]
				int temp = unsortedArray[currentIndex];
				unsortedArray[currentIndex] = unsortedArray[counter];
				unsortedArray[counter] = temp;
			}
		}
		
		// Swaps values from unsortedArray[currentIndex +1] with unsortedArray[last]
		int temp = unsortedArray[currentIndex +1];
		unsortedArray[currentIndex + 1] = unsortedArray[last];
		unsortedArray[last] = temp;
		
		return currentIndex + 1; // Returns the index for pivot point in the area
	}
}
