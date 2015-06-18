
public class Worker {

	protected String m_work = "I work";
	
	public static void main(String[] args)
	{
		Doctor newDoc = new Doctor();
		newDoc.DoWork();
		Lawyer newLaw = new Lawyer();
		newLaw.DoWork();
		Programmer newPro = new Programmer();
		newPro.DoWork();
		Surgeon newSur = new Surgeon();
		newSur.DoWork();
		WebProgrammer newWPro = new WebProgrammer();
		newWPro.DoWork();
		
		
		Worker newWork = new Worker();
		newWork.DoWork();
		
	}
	
	protected void DoWork()
	{
		System.out.println(m_work);
	}
	
}
