package algo.recursiveLinearSearch;

public class App
{
	public static void main(String[] args)
	{
		int[] testArray = {4,5,1,23,45};
		
		System.out.println(recursiveLinearSearch(testArray, 1, 0));
		System.out.println(recursiveLinearSearch(testArray, 11, 0));
	}
	
	public static int recursiveLinearSearch(int[] arrayToSearch, int valueToFind, int indexPosition)
	{
		
		if(indexPosition > arrayToSearch.length-1) // Not found in the array
		{
			return -1;
		}
		else if(arrayToSearch[indexPosition] == valueToFind) // Found in the array
		{
			System.out.println("Found at index: " + indexPosition);
			return indexPosition;
		}
		else
		{
			System.out.println("index at: " + indexPosition);
			return recursiveLinearSearch(arrayToSearch, valueToFind, indexPosition+1); // Calls method again up an index
		}
	}
	
}
