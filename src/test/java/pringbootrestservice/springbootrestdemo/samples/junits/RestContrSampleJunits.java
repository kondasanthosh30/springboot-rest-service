package pringbootrestservice.springbootrestdemo.samples.junits;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import springbootrestservice.springbootrestdemo.commonutils.JsonUtils;
import springbootrestservice.springbootrestdemo.samples.ProductDetails;
import springbootrestservice.springbootrestdemo.samples.RestContrSample;

//@RunWith(MockitoJUnitRunner.class)
@RunWith(PowerMockRunner.class)
public class RestContrSampleJunits 
{

	private MockMvc mockMVC;
	
	@InjectMocks
	RestContrSample restSample;
	
	@Autowired
	WebApplicationContext webApplicationContext;

	   protected void setUp() 
	   {
	      mockMVC = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	   }
	
	@Test
	public void testDemo() 
	{
		ProductDetails p= new ProductDetails();
		p.setPname("DELL");
		p.setPprice("12588");
		p.setPvalue("25000");
		RequestBuilder requestBuilder=MockMvcRequestBuilders.get("/sample").
				contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(JsonUtils.convertObjecttoJson(p));
		try 
		{
		//	mockMVC.perform(requestBuilder).andExpect(status().is(200)).andReturn();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
