import java.util.* ;
class integer {
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		int[][] arr = new int[3][3];
		System.out.print("Enter 9 elements.");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j] = a.nextInt();
			}
			
		}
		System.out.println("You've entered :");
		for(int i=0;i<3;i++)
			{	
				for(int j=0;j<3;j++)
				{
					if(arr[i][j]<100)
						System.out.print(arr[i][j]+" ");
					else
						System.out.println("Pls enter a value upto two digits only.");
				}
				System.out.print("\n");
			
			}
			
	}
}