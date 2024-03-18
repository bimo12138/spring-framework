package custom.xml_starter;

public class User {

	private String name;

	private Integer age;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public void init() {
		System.out.println("User account init!");
	}

	public void destroy() {
		System.out.println("User account destroy!");
	}
}
