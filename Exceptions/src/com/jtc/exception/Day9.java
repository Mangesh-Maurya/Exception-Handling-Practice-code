package com.jtc.exception;

import java.sql.SQLException;

class HelloException extends Exception{
	
}
class HaiException extends HelloException{
	
}
class ABException extends RuntimeException{
	
}
class BCException extends ABException{
	
}
class A{
	void m1() throws HelloException, ABException {
		
	}
}  
class B extends A{
	/*
	void m1() {
		
	}
	*/
	/*
	void m1() throws HelloException, ABException{ 
		
	}*/
	/*
	void m1()throws HaiException,BCException {
	}
	*/	
	/*
	void m1() throws Exception,ABException {
	}
	*/
   void m1()throws SQLException {
		
	}
}
public class Day9 {

}
