import java.util.* ;
class quad{
	public static void main(String[]args){
		Scanner z = new Scanner(System.in);
		System.out.println("Enter the coefficients of x");
		double a = z.nextInt();
		double b = z.nextInt();
		double c = z.nextInt();
		double d = (b*b - 4*a*c) ;
		double root1 = (-b + Math.sqrt(d))/2*a ;
		double root2 = (-b - Math.sqrt(d))/2*a ;
		System.out.println("First root is " + root1);
		System.out.println("Second root is " + root2);
	}
}