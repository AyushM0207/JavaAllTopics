package akm.com.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Employee {
	private Integer eId;
	private String eName;
	private String eAdd;
}
