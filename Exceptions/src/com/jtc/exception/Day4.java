package com.jtc.exception;

public class Day4 {
	public static void main(String[] args) {
		System.out.println("Main in day4");
		try {
			int i1=Integer.parseInt(args[0]);
			int i2=10/i1;
		}catch(Exception e) {
				System.out.println("Boss of all types of Exceptions");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please provide some value	:"+e);
			
		}catch(NumberFormatException e) {
			System.out.println("please provide some Numeric Value	:"+e);
			
		}catch(ArithmeticException e) {
			System.out.println("please provide some non-zero Numeric Value	:"+e);
			
		}
	}
}