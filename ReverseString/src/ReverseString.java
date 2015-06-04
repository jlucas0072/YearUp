
public class ReverseString {

	public static void main(String[] args) {
		String[] testStrings = {"jancjanvclnv9qidacdqvrwbftrwrbgtwvcdac vwqvwwvs",
				"alsdjfladsjf",
				"test i",
				"alsjdfladsjlfjdasjf;asd"
		};
		
		for (int j =0; j< testStrings.length; j++) {
			reverseAndCompare(testStrings[j]);
		}
	}
 
	//Test other methods in program.
	private static void reverseAndCompare(String test) {
		String x = ReverseString.ReverseInPlace(test);
		System.out.println(x);
		String y = ReverseString.ReverseOutOfPlace(test);
		System.out.println(y);
		boolean compare = x.equals(y);
		System.out.println("Original: " + test + " Compared: " + compare);
	}

	//Switches values of at beginning and end of String and stops.
	public static String ReverseInPlace (String originalString)
	{
		String reverseString = null;
		
		if(originalString != null)
		{
			//string: T E S T E R S = 7,
			//^^^^^   0 1 2 3 4 5 6
			// i=0, j = 6
			char[] originalStringCharacters = originalString.toCharArray();
			
			for(int i = 0, j = originalStringCharacters.length - 1; i < originalStringCharacters.length / 2; i++, j--)
			{
				// i = 0; j = 6
				//temp = S
				// S is replaced by T
				// T is replaced by S
				// S E S T E R T

				// i = 1; j = 5
				// temp = R
				// R is replaced by E
				// E is replaced by R
				// S R S T E E T
				
				// i = 2; j = 4
				// temp = E
				// E replaces S
				// S replaces E
				// S R E T S E T
				
				
				char temp = originalStringCharacters[j];
				originalStringCharacters[j] = originalStringCharacters[i];
				originalStringCharacters[i] = temp;
			
				
			}
			reverseString = new String(originalStringCharacters);
		}	
		return reverseString;
	}
	
	//Puts char from a String into an array in reverse order.
	public static String ReverseOutOfPlace (String originalString)
	{
		String reverseString = null;
		if (originalString != null)
		{
			char[] array1 = originalString.toCharArray();
			char[] array2 = new char[array1.length];		
			
			for (int k = array1.length -1, l = 0; k > -1; k--, l++)
			{
				 array2[l] = array1[k];
			}
			
			reverseString = new String (array2);	
		}
		return reverseString;
	}
}
