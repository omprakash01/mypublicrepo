package spring_example_1_4_DI;

public class ArgumentResolutionBean {
	int years;
	String ultimateAnswer;

	public ArgumentResolutionBean(int years, String ultimateAnswer) {
		this.years = years;
		this.ultimateAnswer = ultimateAnswer;
	}

	public void print() {
		System.out.println("years = " + this.years + ", ultimateAnswer = " + this.ultimateAnswer);
	}
}
