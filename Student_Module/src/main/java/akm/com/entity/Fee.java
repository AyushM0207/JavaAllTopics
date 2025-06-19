package akm.com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Fee_table")
@Data
public class Fee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fee_id")
	private Integer fId;
	
	@Column(name = "fee")
	private double fee;
}
