package custom.factory_bean_starter;

public class Contract {
	private String contractNumber;


	private String contractName;


	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	@Override
	public String toString() {
		return "Contract{" +
				"contractNumber='" + contractNumber + '\'' +
				", contractName='" + contractName + '\'' +
				'}';
	}
}
