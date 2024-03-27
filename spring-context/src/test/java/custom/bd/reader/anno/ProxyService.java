package custom.bd.reader.anno;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class ProxyService {

	@Autowired
	private ProxySimple proxySimple;

	public String getProxyName() {
		return proxySimple.getTime();
	}

}
