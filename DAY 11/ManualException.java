class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}

public class ManualException {
	static void checkAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age is Lesser Than 18");
		}
		else
		{
			System.out.println("Eligible To Vote");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			checkAge(16);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}