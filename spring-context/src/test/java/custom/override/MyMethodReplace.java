package custom.override;

import org.springframework.beans.factory.support.MethodReplacer;

public class MyMethodReplace implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, java.lang.reflect.Method method, Object[] args) throws Throwable {
		// 替换原始方法的实现
		System.out.println("Replacing original doSomething() method");
		// 在这里提供自定义的方法实现
		return null;
	}
}
