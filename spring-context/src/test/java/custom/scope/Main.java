package custom.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("custom/scope_demo.xml");
//		context.getBean("")
	}
}
