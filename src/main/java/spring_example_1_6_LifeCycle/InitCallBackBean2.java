package spring_example_1_6_LifeCycle;

import org.springframework.beans.factory.InitializingBean;

public class InitCallBackBean2 implements InitializingBean {
	private int number;

	public void afterPropertiesSet() throws Exception {
		this.number = 5;
	}

	public void display() {
		System.out.println("using afterPropertiesSet: the value is : " + this.number);
	}

}
