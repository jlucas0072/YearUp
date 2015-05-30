
public class LargestNumber {

	public static void main(String[] args) {
		
		int[] anArray = new int[5];
		anArray[0] = 85;
		anArray[1] = 29;
		anArray[2] = 34;
		anArray[3] = 110;
		anArray[4] = 43;
		
		int[] emptyArray = {};
		int[] nullArray = null;
		

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
	
	public void LargestNumberUsingForLoop (int[] anArray)
	{
		if (anArray != null)
		{
			if (anArray.length > 0)
			{
			int largest = -1;
			
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
		

		else
		{
			System.out.println("This array does not have any numbers.");
		}
		}
		else
		{
			System.out.println("You gave me a null array.");
		}
		
	}
	
	public void LargestNumberUsingWhileLoop (int[] anArray)
	{
		
			if (anArray != null)
			{			
				if (anArray.length > 0)
				{
					int j = 0;
					int largest = anArray[0];
					
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
				else
				{
					System.out.println("This array does not have any numbers.");
				}
			}	
			else
			{
				System.out.println("You gave me a null array.");
			}

	}

}
