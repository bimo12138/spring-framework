package custom.bd.reader.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

// 若不指明proxyMode,当把一个session或request的bean注入到sigleton的bean时，会出现问题。如把购物车bean注入到service bean
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS, scopeName = "prototype")
@Component
public class ProxySimple {

	public String getTime() {
		return LocalDateTime.now().toString();
	}
}
