import java.util.* ;
class compare{
	public static void main(String[]args){
		Scanner z = new Scanner(System.in);
		System.out.println("Enter the numbers you want to compare.");
		double x = z.nextDouble();
		double y = z.nextDouble();
		if(x==y)
			System.out.println("The numbers are equal.");
		
		else
			System.out.println("The number are not equal.");
	}
}