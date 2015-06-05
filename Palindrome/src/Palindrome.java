
public class Palindrome {

	public static void main(String[] args) {

		String string1 = "race car";
		String string2 = "hair";
		
		boolean isString1Palindrome = IsPalindrome(string1);
		boolean isString2Palindrome = IsPalindrome(string2);
		
		//Calls isPalindrome to evaluate string1 and prints message
		if (isString1Palindrome)
		{
			System.out.println(string1 + " is a palindrome");
		}
		else
		{
			System.out.println(string1 + " is not a palindrome");
		}
		
		//Calls isPalindrome to evaluate string2 and prints message
		if (isString2Palindrome)
		{
			System.out.println(string2 + " is a palindrome");
		}
		else
		{
			System.out.println(string2 + " is not a palindrome");
		}
	}

	//Determines if a string is a palindrome
	public static boolean IsPalindrome(String wordInput)
	{
		boolean isPalindrome = true;
		if (wordInput != null)
		{
			//Removes spaces and set the string to all lowercase
		String wordInputNoSpace = wordInput.replace(" ", "").toLowerCase();
		char[] wordInputChars = wordInputNoSpace.toCharArray();
		
		//Creates loops to scan through arrays
		for (int i = 0, k = wordInputChars.length -1; i < wordInputChars.length / 2; i++, k--)
		{
			if (wordInputChars[i] != wordInputChars[k])
			{
				isPalindrome = false;
				break;
			}
		}
	}
			
			else
			{
				System.out.println("You gave me a null string :(");
				isPalindrome = false;
			}
			
			return isPalindrome;
	}
		
	
}
