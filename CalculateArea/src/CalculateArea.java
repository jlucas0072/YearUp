
public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double circleArea = CalculateCircleArea(5);
		System.out.println ("The area of the circle is : " + circleArea);
		double rectangleArea = CalculateRectangleArea(3,4);
		System.out.println ("The area of the rectangle is : " + rectangleArea);
	}
	
	public static double CalculateCircleArea(int radius) {
		double area = 3.14 * radius * radius;
				return area;
	}
	
	public static double CalculateRectangleArea(int length, int breadth){
	double area = length * breadth;
	return area;
	}
	
}

