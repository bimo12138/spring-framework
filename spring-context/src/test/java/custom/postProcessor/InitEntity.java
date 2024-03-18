package custom.postProcessor;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class InitEntity {

	public void init() {
		System.out.println("xml init method");
	}

	@PostConstruct
	public void annoInit() {
		System.out.println("注解提供的 INIT");
	}
}
