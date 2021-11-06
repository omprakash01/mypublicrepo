package spring_example_1_6_LifeCycle;

import org.springframework.beans.factory.DisposableBean;

public class DestroyCallBackBean2 implements DisposableBean {
	private String str;

	public void destroy() throws Exception {
		this.str = "Cleaning up done... ";
		display();
	}

	public void display() {
		System.out.println(this.str);
	}

}
