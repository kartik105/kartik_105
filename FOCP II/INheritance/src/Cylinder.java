class Cylinder extends Circle 
{
	private double height ;
	public Cylinder()
	{
		super() ;
		this.height = 1.0 ;
	} 
	public Cylinder(double radius)
	{
		super(radius ) ;
		this.height = 1.0 ;
	}
	public Cylinder(double rdius, double h)
	{
		super(radius ) ;
		this.height = h ;
	}
	public Cylinder(double radius, double height, String color)
	{
		super(radius, color);
		this.height = h ;
	}
	public double getHeight()
	{
		return height ;
	}
	public void setHeight(double h)
	{
		this.height = h ;
	}
	public double getVolume()
	{
		return getArea*height ;
	}

}