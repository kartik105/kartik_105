import java.util.* ;
class digit {
	public static void main(String[]args){
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the 5 digit number");
		int x = a.nextInt();
		System.out.println("You entered " + x);
		if(x>9999 && x<100000){
		int b = x%10 ;
		int c = ((x - b)%100)/10 ;
		int d = ((x - b - c)%1000)/100 ;
		int e = ((x - b - c - d)%10000)/1000 ;
		int f = (x - b - c - d - e)/10000;
		System.out.println(f + "\t" + e + "\t" + d + "\t" + c + "\t" + b+ "\t" + a); 
		}
		else
			System.out.println("Invalid entry.");
	}
}