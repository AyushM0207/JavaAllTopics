package akm.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AvoidHardCodedValueApplication implements CommandLineRunner{
	
	@Autowired
	private RoleConfig config;
	public static void main(String[] args) {
		SpringApplication.run(AvoidHardCodedValueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(config.getRole(EnumRole.Guest));
	}

}
