package custom.convert.entity;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ActualEntity {

	private String requestUrl;

	public static ActualEntity init(RequestEntity requestEntity) {
		ActualEntity actualEntity = new ActualEntity();
		actualEntity.setRequestUrl( String.format("%s:%s", requestEntity.getPath(), requestEntity.getName()) );
		return actualEntity;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	@Override
	public String toString() {
		return "ActualEntity{" +
				"requestUrl='" + requestUrl + '\'' +
				'}';
	}
}
