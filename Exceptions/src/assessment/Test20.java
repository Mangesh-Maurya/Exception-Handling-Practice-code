package assessment;

public class Test20 {
	public static void main(String[] args) {
		try {
			throw 10;
		}
		catch(int e) {
			System.out.println("Got the Exception "+e);
		}
	}

}
