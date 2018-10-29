package springbootrestservice.springbootrestdemo.privateandstatic;

import static org.hamcrest.CoreMatchers.any;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.beans.factory.annotation.Autowired;

import springbootrestservice.springbootrestdemo.junitsdemo.DemoJunits;

@RunWith(PowerMockRunner.class)
@PrepareForTest(DemoJunits.class)
public class PrivateStaticDemo 
{

	@Autowired
	private DemoJunits demoJunits; 
	
	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		
	}
	@Test
	public void privateDemo()
	{
		DemoJunits demo=new DemoJunits();
		DemoJunits spyObj=PowerMockito.spy(demo);
		
		
	}
	
	@Test
	public void staticDemo() throws Exception
	{
		
		System.out.println("Before Mock "+demoJunits.staticDemo("santhosh"));
		
		PowerMockito.mockStatic(DemoJunits.class);
		
		//PowerMockito.doReturn("Mocked Value").when(DemoJunits.class, "staticDemo("santhosh")");
			
	}		


}
