package custom.depend;

import java.time.LocalDate;

public class VIPAccount {
	private String expireDate;

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	@Override
	public String toString() {
		return "VIPAccount{" +
				"expireDate=" + expireDate +
				'}';
	}


	public void init() {
		System.out.println("VIP account init!");
	}

	public void destroy() {
		System.out.println("VIP account destroy!");
	}
}
