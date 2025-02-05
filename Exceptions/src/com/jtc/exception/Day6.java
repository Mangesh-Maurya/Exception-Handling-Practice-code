package com.jtc.exception;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

class Helo{
	void m1(int i) {
			System.out.println("M1 in Helo");
			try {
			if(i==0) {
				throw new ArithmeticException();
			}else {
				throw new ArrayIndexOutOfBoundsException();
				}
			}catch(ArithmeticException e) {
				System.out.println("plese don't provide zero value  :"+e);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("please provide some value  :"+e);
			}
	}
	void m2(int i)throws FileNotFoundException {
		System.out.println("m2 in Helo");
		try {
		if(i==0) {
		throw new InstantiationException();
		}else {
			throw new FileNotFoundException();
		}
		}catch(InstantiationException e) {
		System.out.println(e);
		}
	}
	void m3()throws FileNotFoundException,InstantiationException {
		System.out.println("m3 in Helo");
		m2(1);
	}
		
}
public class Day6 {
	public static void main(String[] args)throws FileNotFoundException,InstantiationException {
		Helo h1=new Helo();
		h1.m1(1);
		
		h1.m3();
	}
}
