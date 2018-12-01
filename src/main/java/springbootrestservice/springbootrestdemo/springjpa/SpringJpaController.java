package springbootrestservice.springbootrestdemo.springjpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springbootrestservice.springbootrestdemo.vo.Student;

@RestController
@RequestMapping(path="/springjpa")
public class SpringJpaController 
{
	@Autowired
	private StudentRepository studentRepo;
	
	@RequestMapping(path="/insert",produces={"application/json"},consumes= {"application/json"},method=RequestMethod.POST)
	public String insertData(@RequestBody Student stud)
	{
		
		studentRepo.save(stud);
		return "success";
		
	}

	@RequestMapping(path="/update",produces={"application/json"},consumes= {"application/json"},method=RequestMethod.POST)
	public String updateData(@RequestBody Student stud)
	{
		
		studentRepo.save(stud);
		return "success";
		
	}
	
	@RequestMapping(path="/delete/{id}",produces={"application/json"},consumes= {"application/json"},method=RequestMethod.POST)
	public String deleteData(@PathVariable(name="id") int id)
	{
		
		studentRepo.deleteById(id);
		return "success";
		
	}

	@RequestMapping(path="/search",produces={"application/json"},consumes= {"application/json"},method=RequestMethod.POST)
	public String searchData(@PathVariable(name="id") int id)
	{
		
		Optional<Student> findById = studentRepo.findById(id);
		if(!findById.isPresent())
			System.out.println("exception");
		return "success";
		
	}
}
