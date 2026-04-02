public class CompileTimeException {
    public static void main(String[] args)
	{
		Thread T=new Thread(()->{
			try
			{
				System.out.println("Thread Sleep");
				Thread.sleep(5000);
				System.out.println("Thread Wake");
			}
			catch(InterruptedException e)
			{
				System.out.println("Sleep Interrupted");
			}
		});
		T.start();
		try
		{
			Thread.sleep(4000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Not I");
		}
		T.interrupt();
	}

}