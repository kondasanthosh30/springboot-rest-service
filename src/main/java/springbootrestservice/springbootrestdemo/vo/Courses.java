/*package springbootrestservice.springbootrestdemo.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Courses")
public class Courses 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="courseId")
	private int courseId;
	@Column(name="courseName")
	private String courseName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Student stud;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
*/