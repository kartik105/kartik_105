import java.util.* ;
class PointDemo 
{
 public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls enter value of x1, y1, x2 and y2");
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		Point p1 = new Point(x1,y1);
		Point p2 = new Point(x2,y2);
		double distance = Point.calculateDistance(p1,p2);
		System.out.println("Distance is " + distance);
	}
}
