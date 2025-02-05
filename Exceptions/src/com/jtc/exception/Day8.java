package com.jtc.exception;
class Window{
	Window(){
		System.out.println("*******Opening Window*******");
	}
	public void close1() {
		System.out.println("*******Closing Window*******");
	}
}
class Room{
	Room() {
		System.out.println("******Opening Room******");
		
	}
	public void close1() {
		System.out.println("******Closing Room******");
	}
	 
}
public class Day8 {
	public static void main(String[] args) {
		Room rm=null;
		Window wn=null;
	try {
		rm=new Room();
		wn=new Window();
		System.out.println("Using room");
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally { 
		wn.close1();
		rm.close1();
	}
	}
}
