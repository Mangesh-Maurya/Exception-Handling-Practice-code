package assessment;

public class Test9 
{
	public static void aMethod()throws Exception
	{
		try
		{
			throw new Exception();
		}
		finally
		{
			System.out.println("Finally");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			aMethod();
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
		System.out.println("finished");
		
	}

}
