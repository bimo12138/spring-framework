package custom.factory_bean_starter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ContractService {

	public String getNextContractName() {
		return String.format("HT-%s", LocalDateTime.now());
	}
}
