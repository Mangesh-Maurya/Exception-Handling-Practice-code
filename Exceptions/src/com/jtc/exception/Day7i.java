package com.jtc.exception;

import java.io.IOException;

class AException extends Exception{
	
}
class BException extends RuntimeException{
	
}
class Hello11{
	void m1()throws AException,InstantiationException {
		System.out.println("m1 in Hello");
		throw new AException();
	}
	void m2()throws BException,IOException {
		System.out.println("m2 in Hello");
		throw new BException(); 
	}
	void m3() throws IOException{
		System.out.println("M3 in Hello");
		try {
		m1();
		m2();
		}catch(AException|InstantiationException e) {
	}
}
}
public class Day7i{
	public static void main(String[] args)throws IOException {
		Hello11 h1=new Hello11();
		h1.m3();
	}
}