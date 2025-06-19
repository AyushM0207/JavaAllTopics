package akm.com.modal;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Student {
	private Integer sid;
	private String sname;
	private double scourse;
	}
