package custom.factory_bean_starter;

import org.springframework.beans.factory.FactoryBean;

public class FactoryContract implements FactoryBean<Contract> {

	private Object service;

	public FactoryContract(Object baseService) {
		this.service = baseService;
	}
	@Override
	public Contract getObject() throws Exception {
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		return Contract.class;
	}
}
