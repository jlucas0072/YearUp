
public class ExceptionCentral {

	public static void main(String[] args)
	{
		ExceptionCentral exceptionsCentral = new ExceptionCentral();

		try 
		{
			exceptionsCentral.Division(10,0);
		}

		catch(Exception ex)
		{
			System.out.println("there is no solution");
		}

		exceptionsCentral.HandleNull(null);
		int nullArray[] = null;
		exceptionsCentral.PrintArrayValues(nullArray);
	}
	
	int Division(int numerator, int denominator) throws ArithmeticException
	{	
		int quotient = numerator / denominator;
		System.out.println(numerator + " divided by  " + denominator + " is not a real number");
		
		return quotient;
	}
	
	void HandleNull(String strNull) throws NullPointerException
	{
		String lCStr = strNull.toLowerCase();
		System.out.println(lCStr);
	}
	
	void PrintArrayValues(int[] nullArray)
	{
		try
		{
			for (int i = 0; i < 10; i++)
			{
				System.out.println(nullArray[i]);
			}
		}
		/*
		catch(Exception exception)
		{
			exception.printStackTrace();
		}*/
		catch (ArrayIndexOutOfBoundsException arrayIndexEx)
		{
			System.out.println("array passed in did noot have 10 slots");
			arrayIndexEx.printStackTrace();
		}
		catch(NullPointerException nullPtrEx)
		{
			System.out.println("array passed in is null");
			nullPtrEx.printStackTrace();
		}
	
	}
	
}
