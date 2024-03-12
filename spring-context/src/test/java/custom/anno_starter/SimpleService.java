package custom.anno_starter;

import custom.xml_starter.User;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {

	private User getUser() {
		User user = new User();
		user.setAge(12);
		user.setName("测试");
		return user;
	}
}
