package springbootrestservice.springbootrestdemo.samples;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class RestContrSample 
{
	@Autowired
	UserRepo userRepo;
	

	@RequestMapping(value="/sample",method=RequestMethod.GET,produces= {"application/json"},consumes= {"application/json"})
	
	 public  void contentXml(@RequestBody ProductDetails pd)
	{
		System.out.println("Deatils"+pd.getPname()+","+pd.getPprice()+","+pd.getPvalue());
		
	}
	
}
