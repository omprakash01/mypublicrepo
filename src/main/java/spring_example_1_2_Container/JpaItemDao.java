package spring_example_1_2_Container;

public class JpaItemDao {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("Hi from JpaItemDao");
	}

}
