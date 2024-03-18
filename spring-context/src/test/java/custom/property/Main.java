package custom.property;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		MutablePropertySources propertySources = environment.getPropertySources();
		HashMap<String, Object> map = new HashMap<>();
		map.put("simpleDesc", "easy propertySource inject");
		MapPropertySource mapPropertySource = new MapPropertySource("custom", map);
		propertySources.addFirst(mapPropertySource);
		Info bean = applicationContext.getBean(Info.class);
		System.out.println(bean);
	}
}
