package algo.linearsearch;

public class App
{
	public static void main(String[] args)
	{
		int[] testArray = {4,5,1,23,45};
		System.out.println(linearSearch(testArray, 1));
		System.out.println(linearSearch(testArray, 2));
	}
	public static int linearSearch(int[] arrayToSearch, int valueToFind)
	{
		for(int i = 0; i < arrayToSearch.length; i++)
		{
			if(arrayToSearch[i] == valueToFind)
			{
				return i;
			}
		}
		return -1; //Negative one represents value not found in array
	}
}
