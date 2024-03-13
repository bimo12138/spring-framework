package custom.ltw_starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.weaving.LoadTimeWeaverAwareProcessor;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
		// ltw 织入
		// 普通 织入
	}
}
