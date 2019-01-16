import java.util.* ;
class vowel {
	public static void main(String[] args) 
	{
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the charecter");
		char b = c.next().charAt(0);
		if(b == 'a' || b == 'e' || b == 'i' || b== 'o' || b=='u' || b=='A' || b=='I' || b=='E'||b=='O'||b=='U')
		{
			System.out.println("The entered charecter is a vowel");
		}
		else
			System.out.println("The entered charecter is a consonant.");
		
	}
}
