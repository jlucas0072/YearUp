
public class LargestNumber {

	public static void main(String[] args) {
		
		//Creates arrays used for testing
		int[] anArray = new int[5];
		anArray[0] = 85;
		anArray[1] = 29;
		anArray[2] = 34;
		anArray[3] = 110;
		anArray[4] = 43;
		
		int[] emptyArray = {};
		int[] nullArray = null;
		
//Runs each type of array through the methods.
		LargestNumber newLN = new LargestNumber();
		System.out.println("This finds the largest number using a for loop.");
		newLN.LargestNumberUsingForLoop(anArray);
		System.out.println("This finds the largest number using a while loop.");
		newLN.LargestNumberUsingWhileLoop(anArray);
		System.out.println("Empty array test: ");
		newLN.LargestNumberUsingForLoop(emptyArray);
		newLN.LargestNumberUsingWhileLoop(emptyArray);
		System.out.println("Null array test: ");
		newLN.LargestNumberUsingForLoop(nullArray);
		newLN.LargestNumberUsingWhileLoop(nullArray);

	}
	
	//Sorts array using a for loop.
	public void LargestNumberUsingForLoop (int[] anArray)
	{
		//Checks if array is null.
		if (anArray != null)
		{
			//Checks if array is empty.
			if (anArray.length > 0)
			{
			int largest = -1;
			
			/*Stores a number from the array. If the next is larger, 
			 * it stores that number and continues checking.
			 */
			for(int i = 0; i < anArray.length; i++)
			{
				int current = anArray[i];

				if (current > largest)
				{
					largest = current;
				}
			}
			System.out.println(largest);
		}
		
//If array is empty, prints an error message.
		else
		{
			System.out.println("This array does not have any numbers.");
		}
		}
		////If array is null, prints an error message.
		else
		{
			System.out.println("You gave me a null array.");
		}
		
	}
	
	//Sorts array using a while loop.
	public void LargestNumberUsingWhileLoop (int[] anArray)
	{
		//Checks if array is null.
			if (anArray != null)
			{	
				//checks if array is empty.
				if (anArray.length > 0)
				{
					int j = 0;
					int largest = anArray[0];
					
					/*Stores a number from the array. If the next is larger, 
					 * it stores that number and continues checking.
					 */
					while (j < anArray.length)
					{
						int current = anArray[j];
						if (current > largest)
						{
							largest = current;
						}
						j++;
					}
				System.out.println(largest);
				}
				//If array is empty, prints an error message.
				else
				{
					System.out.println("This array does not have any numbers.");
				}
			}
			//If array is null, prints an error message.
			else
			{
				System.out.println("You gave me a null array.");
			}

	}

}
