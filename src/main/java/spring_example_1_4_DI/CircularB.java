package spring_example_1_4_DI;

public class CircularB {
	CircularA a;

	public CircularB(CircularA a) {
		super();
		this.a = a;
	}

	public CircularA getA() {
		return a;
	}

	public void setA(CircularA a) {
		this.a = a;
	}
}
