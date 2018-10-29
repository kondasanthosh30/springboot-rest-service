package springbootrestservice.springbootrestdemo.typesofparameters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootrestservice.springbootrestdemo.constants.Constants;

/**
 * @author santkond
 *
 */
@RestController
public class DifferentTypesofParameters 
{

	@GetMapping(path=Constants.QUERY_PARAMETER,produces= {"application/json"},consumes= {"application/json"})
	public String queryParam()
	{
		
		return "sucess for query parameter";
	}
	
	@GetMapping(path=Constants.PATH_PARAMETER,produces= {"application/json"},consumes= {"application/json"})
	public String pathParam()
	{
		return "sucess for path parameter";
	}
	
}
