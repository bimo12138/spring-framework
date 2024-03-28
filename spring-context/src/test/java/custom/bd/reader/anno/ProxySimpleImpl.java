package custom.bd.reader.anno;

import java.time.LocalDate;

public class ProxySimpleImpl implements ProxySimpleIntf{

	@Override
	public String getName() {
		return String.valueOf("proxy-value: is: " + String.valueOf(LocalDate.now()));
	}
}
