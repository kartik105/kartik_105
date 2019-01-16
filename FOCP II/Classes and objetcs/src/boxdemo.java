import java.util.* ;
class Box
{
	double width;
	double depth;
	double height;
	Box(double width,
		double depth,
		double height)
	{
		this.width = width;
		this.depth = depth;
		this.height= height;
	}
	Box()
	{
		this.width = 0;
		this.depth = 0;
		this.height= 0;
	}
	
	void setDim()
	{
		width = 12;
		depth = 13;
		height = 14;
	}
	
		double volume()
		{
			double volume = width*height*depth;
			return  volume;
		}
	
}
class BoxDemo
{
	
 public static void main(String[] args)
 {
 	Box b = new Box();
 	b.setDim();
 	double vol = b.volume();
 	System.out.println("The volume is " + vol);
 	Box var1 = new Box(3,4,5);
 	double vol1 = var1.volume();
 	System.out.println("New volume = " + vol1);
 }	

}