package workbook;

import java.io.IOException;
import java.sql.SQLException;

public class Jtc8 {
	public static void main(String[] args)throws IOException,ArithmeticException {
		Hello h=new Hai();
		h.m1(1);
	}
}
class AException extends IOException{}
class Hello{
	void m1(int x) throws IOException,ArithmeticException{
		if(x==1) {
			throw new ArithmeticException();
		}
		else {
			throw new IOException();
		}
	}
}
class Hai extends Hello{
	
	public void m1(int x) {
		System.out.println("Hai-m1");     //ok
	}
	
	/*
	public void m1(int x)throws IOException,ArithmeticException{
		System.out.println("Hai-m1");         //ok
	}
	*/
	/*
	public void m1(int x)throws AException,ArithmeticException{
		System.out.println("Hai-m1");      //ok
	}
	*/
	/*
	public void m1(int x)throws Exception,ArithmeticException{   //not ok
		System.out.println("Hai-m1");           
	}
	*/
	/*
	public void m1(int x)throws AException,ArithmeticException,SQLException{    //not ok
		System.out.println("Hai-m1");
	}*/
}