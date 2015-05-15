
public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Jack", 7, "7701234567", "1st Street");
		System.out.println("This person's name is: " + person1.GetName());
		System.out.println("This person's age is: " + person1.GetAge());
		System.out.println("This person's phone number is: " + person1.GetPhoneNumber());
		System.out.println("This person's address is: " + person1.GetAddress());
		person1.GrowsOlder();
		System.out.println("Next year, this person's age will be: " + person1.GetAge());

	}

}
