package com.jtc.exception;
public class Day3 {
	public static void main(String[] args) {
		System.out.println("Manin in Test1");
		try{
		   int i1=Integer.parseInt(args[0]);
		   int i2=10/i1;
		}catch (Exception e ) {
			System.out.println(e);
		}
	}
}
