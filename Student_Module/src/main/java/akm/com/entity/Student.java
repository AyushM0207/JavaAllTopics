package akm.com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Student_table")
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Integer id;
	
	@Column(name = "student_name")
	private String sName;
	
	@Column(name = "student_email")
	private String sEmail;
	/*
	@OneToOne
	@Column(name = "student_address")
	private Address sAdd;
	
	@ManyToMany
	@Column(name = "student_course")
	private Course course;
	
	@OneToMany
	@Column(name = "student_fee")
	private Fee fee;
*/
}
