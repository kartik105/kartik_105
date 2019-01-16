import java.util.* ;         
class ques2 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[5];
		Scanner a = new Scanner(System.in);
		System.out.println("Enter 5 values.");
		for(int i=0;i<5;i++)
		{
			arr[i] = a.nextInt();
		}
		System.out.println("You entered :");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		int sum = 0 ;
		for(int i=0;i<5;i++)
		{
			sum+=arr[i] ;
		}
			System.out.println("Sum = " + sum);
			int w =arr[0] ;
		for(int i=0;i<5;i++)
		{
			if(w < arr[i])
			{
				w = arr[i];
			}
		}
		System.out.println("Greatest number is : " + w);
		int q = arr[0];
		for(int i=0;i<5;i++)
		{
			if(q > arr[i])
			{
				q = arr[i];
			}
		}
		System.out.println("Smallest number is " + q);

				
			
	}
}