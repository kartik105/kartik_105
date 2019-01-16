import java.util.* ;
class index{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[10];
		System.out.println("Enter 10 values");
		for(int x = 0 ; x<10; x++ ){
			arr[x]= scan.nextInt();
		}	
		System.out.println("Enter the value to be searched.");
		int search = scan.nextInt();
		int index = -1 ;
		for(int x =0; x<10; x++){
			if(search == arr[x])
				index = x;
		}
		System.out.println("Index : " + index);

	}
}

