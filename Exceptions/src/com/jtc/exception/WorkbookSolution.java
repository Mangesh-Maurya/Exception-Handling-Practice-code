package com.jtc.exception;
class Hello9{
	void m1() {
		System.out.println("M1 in Hello");
	}
	int m2(int i) {
		System.out.println("M2 in Hello");
		try {
			int i1=10/i;
			System.out.println(i1);
			return 10;
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally in m2");
			return 202;
		}
		//return 20;
	}
}

public class WorkbookSolution {
	public static void main(String[] args) {
	Hello9 h1=new Hello9();
	int i=h1.m2(1);
	System.out.println(i);
	}
}
