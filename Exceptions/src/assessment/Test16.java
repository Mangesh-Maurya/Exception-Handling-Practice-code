package assessment;

public class Test16
{
	public static void main(String[] args) {
		{
			try
			{
				int a=5/0;
				System.out.println("TRY");
			}
			catch(ArithmeticException e) {
				System.out.println("CATCH");
			}
		}
	}

}
