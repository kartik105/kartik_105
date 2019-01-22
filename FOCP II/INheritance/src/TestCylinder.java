class TestCylinder
{
	public static void main(String[] args) 
	{
		Cylinder c = new Cylinder() ;
		double r = c.getRadius() ;
		System.out.println("Radius = " + r) ;
		double h = c.getHeight() ;
		System.out.println("Height = " + h) ;
		double area = c.getArea() ;
		System.out.println("Area = " + area) ;
		double volume = c.getVolume() ;
		System.out.println("Volume = " + volume) ;
	}
}