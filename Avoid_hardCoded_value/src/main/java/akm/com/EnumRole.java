package akm.com;

public enum EnumRole {
	Admin("admin"),
	User("user"),
	Guest("guest"),
	Roles("roles");

	private String key;

	EnumRole(String key) {
		this.key = key;
	}
	public String getKey() {
		return key;
	}
}
