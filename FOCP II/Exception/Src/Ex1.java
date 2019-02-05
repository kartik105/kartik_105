	class Ex1
{
	public static void f() throws Exception
	{
		System.out.println("Throwing my Exception from f()");
		throw new Exception("From f()");
	}
	public static void main(String[] args) 
	{
		try 
		{	
			f();
		}	
		catch(Exception e)
		{
			System.err.println("Caught Exception");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Made it to finally");
		}
	}
}	