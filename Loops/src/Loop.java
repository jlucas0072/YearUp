
public class Loop {

	public static void main(String[] args) {

		int[] testArray = {1,2,3,3,3,7};
		int[] testArray2 = {};
		int[] testArray3 = {1,2,3,4,5,6,7,8,9};
		int search = 3;
		int search9 = 9;

		Loop newLoop = new Loop();
		newLoop.findOccurrences(testArray, search);
		newLoop.searchArray(testArray, search);
		newLoop.findOccurrences(testArray2, search);
		newLoop.searchArray(testArray2, search);
		newLoop.findOccurrences(testArray3, search9);
		newLoop.searchArray(testArray3, search9);
	}
	
	public void searchArray(int[] testArray, int search)
	{
		
		for(int i = 0; i < testArray.length; i++)
		{
			if (search == testArray[i])
			{
				System.out.println("The array contains " + search + " at index " + i + ".");
				break;
			}
			else
			{
				System.out.println("The array does not contain " + search + ".");
				break;
			}
		}
	}

	public void findOccurrences(int[] testArray, int search)
	{
		int j = 0;
		int numberOfOccurrences = 0;
		
		while (j < testArray.length)
		{
			if (search == testArray[j])
			{
				numberOfOccurrences++;
			}
			j++;
		}
		System.out.println("The number " + search + " occurs " + numberOfOccurrences + " time(s) in the array.");	}
	
}
