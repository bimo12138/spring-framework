package custom.override;

import java.math.BigDecimal;

public class User {

	private String name;

	private BigDecimal money;

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", money=" + money +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}
}
