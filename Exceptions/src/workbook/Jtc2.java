package workbook;

public class Jtc2 {
	public static void main(String[] as) {
		System.out.println("main begin");
		try {
			int x=Integer.parseInt(as[0]);
			System.out.println(x);
			int y=10/x;
			System.out.println(y);
		}
		//System.out.println("not ok");
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide the value");
			System.out.println(e);
		}
		//System.out.println("not ok");
		catch(NumberFormatException e) {
			System.out.println("Please provide the integer value");
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println("please don't provide the zero");
			System.out.println(e);	
		}catch(Exception e) {
			System.out.println("please don't do this");
			System.out.println(e);
		}
		System.out.println("main end");
	}

}
