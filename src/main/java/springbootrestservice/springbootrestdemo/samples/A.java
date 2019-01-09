package springbootrestservice.springbootrestdemo.samples;

public class A  extends Thread
{
	
	public void run()
	{
		for(int i=65; i<=90; i++)
		{
			System.out.println(i);
		}
	}

}
