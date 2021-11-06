package spring_example_1_6_LifeCycle;

public class InitCallBackBean {
	private int number;
	
	public void init() {
		this.number=5000;
    }
	
	public void display() {
		System.out.println("Using init: The value is : " + this.number);
	}

}
