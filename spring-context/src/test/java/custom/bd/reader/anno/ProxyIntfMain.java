package custom.bd.reader.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProxyIntfMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProxyIntfConfig.class);
		ProxySimpleIntf bean = context.getBean(ProxySimpleIntf.class);
		System.out.println(bean.getName());
	}
}
