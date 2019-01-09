package springbootrestservice.springbootrestdemo.samples;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demo")
public class demo 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@SequenceGenerator(name="",sequenceName="",allocationSize=1)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="lastname")
	private String lastname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public demo(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
	}
	public demo() {
		
	}

}
