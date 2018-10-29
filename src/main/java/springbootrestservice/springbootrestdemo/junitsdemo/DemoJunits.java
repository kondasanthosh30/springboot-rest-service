package springbootrestservice.springbootrestdemo.junitsdemo;

import org.springframework.stereotype.Component;

@Component
public class DemoJunits 
{
	
	
	public static String staticDemo(String sa)
	{
		return"Demo for static method"+sa;
	}
	
	private String privateDemo()
	{
		return "Demo for private method";
	}

}
