package custom.depend;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("custom/depend-on.xml");
		ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
		/**
		 * dependentBeanMap: { "account": ["vipAccount", "simpleUser"]}
		 * dependenciesForBeanMap: {"vipAccount": ["account"], "simpleUser": ["account"]}
		 */
		applicationContext.close();
	}
}
