package algo.recursivebinarysearch;

public class App
{

	public static void main(String[] args)
	{
		
		int[] testArray = {4,5,1,23,45};
		
		System.out.println(recursiveBinarySearch(testArray, 0, testArray.length-1, 23));
		System.out.println(recursiveBinarySearch(testArray, 0, testArray.length-1, 21));

	}
	
	public static int recursiveBinarySearch(int[] arrayToSearch, int startIndex, int endIndex, int valueToFind)
	{
		System.out.println("[" + startIndex + "..." + endIndex + "]");
		if(startIndex > endIndex) 
		{
			return -1;
		}
		else
		{
			int middleIndex = (startIndex + endIndex)/2;
			if(arrayToSearch[middleIndex] == valueToFind)
			{
				return middleIndex;
			}
			else if(valueToFind < middleIndex)
			{
				return recursiveBinarySearch(arrayToSearch, startIndex, middleIndex-1, valueToFind);
			}
			else
			{
				return recursiveBinarySearch(arrayToSearch, middleIndex + 1, endIndex, valueToFind);
			}
		}
	}
}
