import java.util.* ;
class rhombus
{
	public static void main(String[] args) 
	{
		char ch ='A';
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of longest row");
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		{
			ch = 'A';
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch);
				ch ++ ;
			}
			for(int k=i;k>=0;k--)
			{
				ch --;
				System.out.print(ch);
			}
			System.out.print("\n");
		}	
	}
}