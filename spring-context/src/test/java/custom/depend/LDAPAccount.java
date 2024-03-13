package custom.depend;

public class LDAPAccount {

	private String email;

	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void init() {
		System.out.println("LDAP account init!");
	}

	public void destroy() {
		System.out.println("LDAP account destroy!");
	}
}
