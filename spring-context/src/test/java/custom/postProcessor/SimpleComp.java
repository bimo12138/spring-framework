package custom.postProcessor;

import org.springframework.stereotype.Component;

@Component
public class SimpleComp {

	private String compName;

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	@Override
	public String toString() {
		return "SimpleComp{" +
				"compName='" + compName + '\'' +
				'}';
	}
}
