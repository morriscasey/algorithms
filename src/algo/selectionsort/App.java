package algo.selectionsort;

public class App
{
	public static void main(String[] args)
	{
		int[] testArray = {4,5,1,23,45};
		int[] myArray = selectionSort(testArray);
		for(int i=0; i< myArray.length; i++)
		{
			System.out.print(myArray[i] + " ");
		}
	}
	
	public static int[] selectionSort(int[] unsortedArray)
	{
		for(int i=0; i< unsortedArray.length; i++)
		{
			int minimum = i; // Hold index of minimum value
			
			for(int j= i+1; j< unsortedArray.length; j++) //Always checks one above
			{
				if(unsortedArray[j] < unsortedArray[minimum])
				{
					minimum = j;
					int swapValue = unsortedArray[i];
					unsortedArray[i] = unsortedArray[minimum];
					unsortedArray[minimum] = swapValue;
					System.out.print(unsortedArray[i] + " swapped with " + unsortedArray[minimum]);
					System.out.println();
				}
			}
		}
		return unsortedArray;
	}
	
}
