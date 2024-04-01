package custom.factory_bean_starter;

import org.springframework.beans.factory.FactoryBean;

public class FactoryContract implements FactoryBean<Contract> {

	private Object service;

	public FactoryContract(Object baseService) {
		System.out.println("CONTRACT FACTORY INIT");
		this.service = baseService;
	}
	@Override
	public Contract getObject() throws Exception {
		if (service instanceof ContractService) {
			Contract contract = new Contract();
			contract.setContractName(((ContractService) service).getNextContractName());
			return contract;
		}
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		return Contract.class;
	}
}
