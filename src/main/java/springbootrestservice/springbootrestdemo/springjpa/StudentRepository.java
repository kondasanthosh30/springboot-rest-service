package springbootrestservice.springbootrestdemo.springjpa;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootrestservice.springbootrestdemo.vo.Student;

@Repository
@Transactional
public interface StudentRepository  extends JpaRepository<Student,Integer>
{

}
