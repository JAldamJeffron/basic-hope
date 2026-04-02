public class ExceptionHandling {
	public static void main(String[] args)
	{
		try
		{
			int a=283,b=0;
			int c=a/b;
			System.out.println(c);
			
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Number Is Divided By Zero");
		}*/
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}