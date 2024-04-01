package custom.instance.cglib;

import custom.bd.reader.anno.ProxySimple;
import custom.bd.reader.anno.Simple;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CGInstanceMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProxySimple.class, Simple.class);
	}
}
