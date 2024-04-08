package custom.property.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.HashMap;
import java.util.Map;

public class AnnoMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(AnnoEntity.class);
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		MutablePropertySources propertySources = environment.getPropertySources();
		Map<String, Object> customMap = new HashMap<>();
		customMap.put("beanName", "12345");
		MapPropertySource mapPropertySource = new MapPropertySource("custom", customMap);
		propertySources.addLast(mapPropertySource);
		applicationContext.refresh();
		AnnoEntity bean = applicationContext.getBean(AnnoEntity.class);
		System.out.println(bean);
	}
}
