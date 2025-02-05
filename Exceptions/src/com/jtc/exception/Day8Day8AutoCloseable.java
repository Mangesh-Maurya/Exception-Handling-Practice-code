package com.jtc.exception; 
class Window1 implements AutoCloseable{
	Window1(){
		System.out.println("*******Opening Window*******");
	}
	public void close() {
		System.out.println("*******Closing Window*******");
	}
}
class Room1 implements AutoCloseable{
	Room1() {
		System.out.println("******Opening Room******");
		
	}
	public void close() {
		System.out.println("******Closing Room******");
	}
	 
}
public class Day8Day8AutoCloseable {
	public static void main(String[] args) {
	//	Room1 rm=null;
	//	Window1 wn=null;
	try(Room1 rm=new Room1(); Window1 wn=new Window1()) {
	
		System.out.println("Using room");
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	}
	}
