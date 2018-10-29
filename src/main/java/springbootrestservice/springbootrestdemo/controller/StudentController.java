package springbootrestservice.springbootrestdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springbootrestservice.springbootrestdemo.vo.Student;

@RestController
public class StudentController 
{	private static final Logger logg=LoggerFactory.getLogger(StudentController.class);

	@PostMapping(value="/student")
	public void getData(@RequestBody Student std)
	{
		
		logg.info("data is"+std.toString());
		
		
	}
}
