package spring_example_1_4_DI;

public class CircularA {
	CircularB b;

	public CircularA(CircularB b) {
		super();
		this.b = b;
	}

	public CircularB getB() {
		return b;
	}

	public void setB(CircularB b) {
		this.b = b;
	}

	public void doSomeThing() {
		System.out.println("Doing some work");
	}
}