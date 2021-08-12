//PP 11.3 and 11.4
public class InvalidDocumentCodeException extends Exception
{
	public InvalidDocumentCodeException()
	{
		super("ERROR! Document code should start with U = unclassified, C = confidential, or P = proprietary!");
	}
}
