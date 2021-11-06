package spring_NestingAndAliasing;

public class HelloBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Heloo !!" + this.name);
	}
}
