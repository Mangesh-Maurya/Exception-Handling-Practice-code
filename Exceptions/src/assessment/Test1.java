package assessment;

public class Test1
{int count=0;
void A() throws Exception
{
	try
	{
		count++;
		try
		{
			count++;
			try
			{
				count++;
				throw new Exception();
			}
			catch(Exception ex)
			{
		count++;
		throw new Exception();
	}
}
	catch(Exception ex)
	{
		count++;
	}
		
}
	catch(Exception e) {
		System.out.println("excep");
	}
	}
void display()
{
	System.out.println(count);
}
public static void main(String[] args)throws Exception {
	Test1 obj1=new Test1();
	obj1.A();
	obj1.display();
}
}

