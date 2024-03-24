package custom.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

public class CustomScope implements Scope {

	private final Map<String, Integer> visitTimes = new HashMap<>();

	private final Map<String, Object> cache = new HashMap<>();
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		Integer i = visitTimes.get(name);
		System.out.println("index of i: " + String.valueOf(i));
		if (i == null) {
			visitTimes.put(name, 1);
			return objectFactory.getObject();
		}
		if (i < 3) {
			visitTimes.put(name, i + 1);
			return cache.get(name);
		}
		visitTimes.remove(name);
		return objectFactory.getObject();
	}

	@Override
	public Object remove(String name) {
		visitTimes.remove(name);
		return cache.remove(name);
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {

	}

	@Override
	public Object resolveContextualObject(String key) {
		return null;
	}

	@Override
	public String getConversationId() {
		return null;
	}
}
