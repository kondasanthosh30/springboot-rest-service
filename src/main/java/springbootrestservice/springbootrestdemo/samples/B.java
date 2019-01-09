package springbootrestservice.springbootrestdemo.samples;

public class B extends Thread {
	public void run()
	{
		for(int i=65; i<=90; i++)
		{
			try {
					System.out.println((char)i);
					sleep(1);
			}
			catch(Exception e)
			{
				
			}
		}
	}


}
