package custom.factory_bean_starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("custom/factory_test_properties.xml");
//		Contract bean = context.getBean(Contract.class);
//		System.out.println(bean);

		FactoryContract contract = context.getBean(FactoryContract.class);
		Contract contract1 = contract.getObject();
		Contract contract2 = contract.getObject();
		System.out.println("factoryContract: " + String.valueOf( contract1 == contract2));
		Contract contract3 = context.getBean(Contract.class);
		Contract contract4 = context.getBean(Contract.class);

		System.out.println("contract: " + String.valueOf( contract3 == contract4 ));
	}
}
