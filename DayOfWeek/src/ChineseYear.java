import java.util.Scanner;


public class ChineseYear {

	
	//Scans for  year and uses EvaluateChineseYear method to 
	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		Scanner scanner = new Scanner(System.in);
		int unknownYear = scanner.nextInt();
		
		ChineseYear newCY = new ChineseYear();
		newCY.EvaluateChineseYear(unknownYear);
		
		scanner.close();
		
	}
	
//Determines which sign of the Chinese zodiac each year corresponds to.
		public void EvaluateChineseYear(int unknownYear){
			
			int s_knownYear = 1990;
				
				
				int yearDifference = unknownYear - s_knownYear;
				int remainder = yearDifference % 12;
			
				//Matches remainder to each case and prints appropriate animal.
				switch (remainder){
				case 0: 
					System.out.println("The year is rat.");
					break;				
				case 1: 
					System.out.println("The year is ox.");
					break;
				case 2: 
					System.out.println("The year is tiger.");
					break;
				case 3: 
					System.out.println("The year is rabbit.");
					break;				
				case 4: 
					System.out.println("The year is dragon.");
					break;				
				case 5: 
					System.out.println("The year is snake.");
					break;				
				case 6: 
					System.out.println("The year is horse.");
					break;				
				case 7: 
					System.out.println("The year is sheep.");
					break;				
				case 8: 
					System.out.println("The year is monkey.");
					break;				
				case 9: 
					System.out.println("The year is rooster.");
					break;				
				case 10: 
					System.out.println("The year is dog.");
					break;
				case 11: 
					System.out.println("The year is pig.");
					break;
					//If remainder does not equal a case, this is printed.
				default:
					System.out.println("The year must be 1900 or later.");
				
		}
	}

}
