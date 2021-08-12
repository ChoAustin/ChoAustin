//PP 11.1 and PP 11.2
public class StringTooLongException extends Exception
{
	public StringTooLongException()
	{
		super("\nString has too many characters.\n\nPlease try again:\n");
	}
}
