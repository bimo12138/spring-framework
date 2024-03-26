package custom.override;

import java.math.BigDecimal;

public class CustomUserService {

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		User user = userService.getUser();
		user.setMoney(BigDecimal.valueOf(100L));
		return user;
	}
}
