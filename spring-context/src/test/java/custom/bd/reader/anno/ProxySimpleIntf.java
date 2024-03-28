package custom.bd.reader.anno;


import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

//@Scope(proxyMode = ScopedProxyMode.INTERFACES, scopeName = "prototype")
public interface ProxySimpleIntf {

	public String getName();
}
