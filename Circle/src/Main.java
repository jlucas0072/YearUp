
public class Main {

	String m_color = null;
	double m_radius = -1;
	
	public static void main(String[] args) {
		//CalculateArea() bigCircle = new CalculateArea(10);
		//PrintColor() newPC = new PrintColor(Red);
		
		Circle bigCircle = new Circle(10);
		bigCircle.CalculateArea();
		double  area1 = bigCircle.CalculateArea();
		System.out.println(area1);
		
		Circle smallCircle = new Circle(5, "Red");
		smallCircle.CalculateArea();
		smallCircle.PrintColor();
		double area2 = smallCircle.CalculateArea();
		System.out.println(area2);
		

	}
	
}