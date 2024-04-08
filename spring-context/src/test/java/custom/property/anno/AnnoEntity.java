package custom.property.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnnoEntity {

	@Value("${beanName:123}")
	private String name;

	@Override
	public String toString() {
		return "AnnoEntity{" +
				"name='" + name + '\'' +
				'}';
	}
}
