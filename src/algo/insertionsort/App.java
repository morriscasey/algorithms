package algo.insertionsort;

public class App
{

	public static void main(String[] args)
	{
		int[] testArray = {34,25,2,12,1};
		int[] sortedArray = insertionSort(testArray);
		for(int index = 0; index < sortedArray.length; index++)
		{
			System.out.print(sortedArray[index] + " ");
		}

	}
	
	public static int[] insertionSort(int[] unsortedArray)
	{
		for(int i=1; i < unsortedArray.length; i++)
		{
			int element =  unsortedArray[i]; // Contains data to move to sorted area
			System.out.println("Current element: " + element);
			int j = i - 1; // Points to last index position in sorted area
			System.out.println("J value:" + j);
			while(j >= 0 && unsortedArray[j] > element)
			{
				unsortedArray[j+1] = unsortedArray[j];
				System.out.println("Index j+1: " + (j+1) + " value changed to " + unsortedArray[j]);
				j--;
				System.out.println("J decreased to " + j);
			}
			unsortedArray[j+1] = element;
			System.out.println(unsortedArray[j+1] + " swapped with element "+ element);
		}
		return unsortedArray;
	}
}
