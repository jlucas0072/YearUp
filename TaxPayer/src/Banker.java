
public class Banker implements ITaxPayer {

	private double m_income;
	private boolean m_donePayingTaxes = false;
	
	public Banker(double income)
	{
		setIncome(income);
	}
	
	private void setIncome(double income)
	{
		m_income = income;
	}
	
	public double getIncome()
	{
		return m_income;
	}
	
	
	public static void main(String[] args)
	{
		
	}

	@Override
	public void PayTaxes(double taxRate) {
		if (m_donePayingTaxes == false)
		{
			double taxes = taxRate * getIncome();
			double newIncome = getIncome() - taxes;
			setIncome(newIncome);
			m_donePayingTaxes = true;
		}
		
	}

	@Override
	public void FileTaxReturn() {
		// TODO Auto-generated method stub
		if (m_donePayingTaxes)
		{
			System.out.println("Banker has filed tax retrun");
		}
		else
		{
			System.out.println("Banker needs to pay tax return");
		}
	}
	}
