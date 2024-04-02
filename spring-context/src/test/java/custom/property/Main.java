package custom.property;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		String[] location = new String[] {"custom/property.xml"};
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(location, false, null);
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		MutablePropertySources propertySources = environment.getPropertySources();
		HashMap<String, Object> map = new HashMap<>();
		map.put("simpleDesc", "easy propertySource inject");
		MapPropertySource mapPropertySource = new MapPropertySource("custom", map);
		propertySources.addLast(mapPropertySource);


		// 创建PropertySourcesPlaceholderConfigurer来处理属性占位符
		PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();

		// 加载属性文件到PropertySourcesPlaceholderConfigurer中
		placeholderConfigurer.setLocation(new ClassPathResource("custom/properties_test.properties"));
		applicationContext.addBeanFactoryPostProcessor(placeholderConfigurer);
		applicationContext.refresh();
		Info bean = applicationContext.getBean(Info.class);
		System.out.println(bean);
	}
}
