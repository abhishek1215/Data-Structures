package customexception;

public class LinkedListEmptyException extends RuntimeException {
	String message;
	public LinkedListEmptyException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}

}
