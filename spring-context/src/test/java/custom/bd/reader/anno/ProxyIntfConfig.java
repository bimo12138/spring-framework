package custom.bd.reader.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

public class ProxyIntfConfig {

	@Bean
	@Scope(proxyMode = ScopedProxyMode.INTERFACES, scopeName = "prototype")
	public ProxySimpleIntf proxySimpleIntf() {
		return new ProxySimpleImpl();
	}
}
