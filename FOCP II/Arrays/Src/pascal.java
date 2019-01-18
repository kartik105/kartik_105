import java.util.* ;
class pascal
{
	public static void main(String[] args) 
	{
		int r,k,i,j,n ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows. ");
		r = scan.nextInt();
		for(i=0;i<r;i++)
		{
			for(k=r;k>i;k--)
			{
				System.out.println(" ");
			}
			n=1;
			for(j=0j<=i;j++)
			{
				System.out.print(n + " ");
				n=n*(i-j)/(j+1) ;
			}
			System.out.println(" ")
		}
	}
}