package com.jtc.exception;
class Hello{
	int m1(){
		System.out.println("M1 in Hello");
		int i1=0;
		int i2=10;
		try {
			int i3=i2/i1;
			System.out.println(i3);
			return 10; 
			
		}catch (Exception e) {
			System.out.println("in catch block");
			System.out.println(e);
		
		}finally {	
		System.out.println("in finally block ");
		
		}
		System.out.println("After Catch block");
		return 20;
		
	}
}
public class Day5 {
	public static void main(String[] args) {
		Hello h1=new Hello();
		h1.m1();
	}

}
