import java.util.* ;
 class Circle
{
	private double radius ;
	private String Color ;
	public Circle()
	{
		this.radius = 1.0 ;
		this.color = "red" ;
	}
	public Circle(double r)
	{
		this.radius = r ;
		this.color = "red" ; 
	}
	Circle(double radius, String color)
	{
		this.radius = r ;
		this.color = c ;
	}
	public double getRadius()
	{
		return radius ;
	}
	public void setRadius(double r)
	{
		this.radius = r ;
	}
	public String getColor()
	{
		return color ;
	}
	public void setColor(String c)
	{
		color = c ;	
	}
	public double getArea()
	{
		return 3.14*radius*radius ;
	}
}