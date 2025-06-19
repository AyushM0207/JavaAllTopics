package akm.com.modal;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Student {
	public Integer sid;
	public String sname;
	public double scourse;
}
