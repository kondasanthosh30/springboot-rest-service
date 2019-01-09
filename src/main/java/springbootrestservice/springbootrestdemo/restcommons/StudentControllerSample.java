/*package springbootrestservice.springbootrestdemo.restcommons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControllerSample 
{
	
	@Value("{$studenturl}")
	private String uri;
	@PostMapping(value="/restcall")
	public String demoRestCall()
	{
		Student s=new Student();
		s.setFirstName("santhosh");
		s.setLastName("konda");
		s.setId("hello");
	
		RestTemplateFactory.getRestTemplate().exchange(uri, RequestMethod.POST,s,Student.class);
		return "hello";
	}

}
*/