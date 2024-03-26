package custom.override;

public class UserService {

	private UserDao userDao;

	public User getUser() {
		User user = new User();
		user.setName("123");
		return user;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
