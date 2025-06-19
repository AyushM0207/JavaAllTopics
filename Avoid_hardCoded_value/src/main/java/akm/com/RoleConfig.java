package akm.com;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties(prefix = "roles")
public class RoleConfig {
	private Map<String, String>map;
	
	public  String getRole(EnumRole role) {
		
		return map.get(role.getKey());
	}
}
