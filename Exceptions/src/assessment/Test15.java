package assessment;

public class Test15 {
	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			System.out.println("Hello world");
			throw new fileNotFoundException();
		}
		System.out.println("Catch Here");
		catch(EOFException e)
		{
			System.out.println("End of file exception");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
	}
}
