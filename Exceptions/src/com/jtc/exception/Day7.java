package com.jtc.exception;
class InvalidServerIdException extends Exception{
	int userId;
	public InvalidServerIdException() {
	
	}
	InvalidServerIdException(int userId){
		this.userId=userId;
		
	}
	public String getMassage() {
		return "userId "+userId+" is invalid";
	}
	public String toString() {
		return this.getClass().getName()+" : "+getMassage();
	}
}
class ServerBusyException extends RuntimeException{
	
}
class User{
	void connectToServer(int userId) {
		System.out.println("connecting Server....");
		if(userId==101) {
			System.out.println("connected...");
		}else {
			try {
			throw  new InvalidServerIdException(userId);
		}catch(InvalidServerIdException e) {
			System.out.println(e);
		}
		}
	}
}
public class Day7 {
	public static void main(String[] args){
		User us=new User();
		us.connectToServer(102);
	}
}
