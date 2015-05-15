
public class Person {
	
	String m_name;
	int m_age;
	String m_phoneNumber;
	String m_address;

	public Person(String name, int age, String phoneNumber, String address){
		SetName(name);
		SetAge(age);
		SetPhoneNumber(phoneNumber);
		SetAddress(address);
	}
	
	public String GetName(){
		return m_name;
	}
	
	private void SetName(String name){
		m_name = name;
	}
	
	public int GetAge(){
		return m_age;
	}
	
	private void SetAge(int age){
		m_age = age;
	}
	
	public String GetPhoneNumber(){
		return m_phoneNumber;
	}
	
	private void SetPhoneNumber(String phoneNumber){
		m_phoneNumber = phoneNumber;
	}

	public String  GetAddress(){
		return m_address;
	}
	
	private void SetAddress(String address){
		m_address = address;
	}
	
	public void GrowsOlder(){
		m_age++;
	}
	
}
