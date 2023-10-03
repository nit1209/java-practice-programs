package challenges;

public class AreaOfCircleAndTraingle {

	public static void main(String[] args) {
		double AreaofCircle=Area(3.0);
		AreaOfCircleAndTraingle a = new AreaOfCircleAndTraingle();
		double AreaOfTraingle=a.Area(50,2);
		System.out.println(AreaofCircle+" "+AreaOfTraingle);
	}
	
	public static double Area(double radius)
	{
		return 3.141*radius*radius;
	}
	
	public double Area(double bredth,double height)
	{
		return 0.5*bredth*height;
	}
}
