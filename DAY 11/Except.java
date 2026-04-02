public class Except {
    public static void main(String[] args)
	{
		//String s=null;
		try
		{
			//System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number is divided by zero");
		}
		catch(NullPointerException e)
		{
			System.out.println("String Value Is Null");
		}
		finally
		{
			System.out.println("Finally Block Always Executed");
		}
	}
}