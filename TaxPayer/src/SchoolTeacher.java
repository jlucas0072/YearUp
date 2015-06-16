
public class SchoolTeacher implements ITaxPayer {

	private double m_income;
	private boolean m_donePayingTaxes = false;
	
	public SchoolTeacher(double income)
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
		Banker blankfein = new Banker(5000000);
		blankfein.FileTaxReturn();
		
		SchoolTeacher doblar = new SchoolTeacher(30000);
		ITaxPayer taxPayer = doblar;
		taxPayer.PayTaxes(.23);
		taxPayer.FileTaxReturn();
		
		Scientist hawking = new Scientist(1200000);
		hawking.PayTaxes(.28);
		hawking.FileTaxReturn();
		
		TaxAuditor tom = new TaxAuditor();
		tom.Audit(doblar);
		tom.Audit(blankfein);
		tom.Audit(hawking);
	}

	@Override
	public void PayTaxes(double taxRate) {
		// TODO Auto-generated method stub
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
			System.out.println("School teacher has filed tax retrun");
		}
		else
		{
			System.out.println("School teacher needs to pay tax return");
		}
	}
}
