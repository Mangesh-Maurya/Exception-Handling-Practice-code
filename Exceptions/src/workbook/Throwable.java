package workbook;

public class Throwable extends Object implements Serilizable {
	public Throwable();
	public void printStackTrace();
	public void printStackTrace(PrintStream);
	public void printStackTrace(PrintWriter);
	public String getLocalizedMassage();
	public String getMassage();
	public String toString();
	public Throwable(String);
	public Throwable getCause();
	public Throwable(Throwable);
	public Throwable(String,Throwable);
	public synchronized Throwable initCause(Throwable);
}
public class Exception extends Throwable{
	static final long serialVersionUID;
	public Exception();
	public Excption(String);
	public Exception(Throwable);
	public Exception(String,Throwable);
}
public class Error extends Throwable{
	static final long serialVersionUID;
	public Error();
	public Error(String);
	public Error(Throwable);
	public Error(String,Throwable);
}
