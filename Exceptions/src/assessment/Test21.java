package assessment;
class Test123 extends Exception{}
public class Test21 {
	public static void main(String[] args) {
		try {
			throw new Test123();
		}
		catch(Test123 t) {
			System.out.println("Got the Test Exception");
		}
		finally {
			System.out.println("Inside finally block ");
		}
	}
}
