package spring_example_1_6_LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CallBackMain {
	private static AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	public static void main(String[] args) {
		// Initialization Callbacks
		initCallback();
		initCallback2();

		// clean and destroy Callbacks
		cleanBean();
		// destroyBean();
		context.registerShutdownHook();

	}

	// Initialization Callbacks
	public static void initCallback() {
		InitCallBackBean initCallBackBean = context.getBean("exampleInitBean", InitCallBackBean.class);
		initCallBackBean.display();
	}

	public static void initCallback2() {
		InitCallBackBean2 initCallBackBean = context.getBean("exampleInitBean2", InitCallBackBean2.class);
		initCallBackBean.display();
	}

	// Initialization Callbacks
	public static void cleanBean() {
		DestroyCallBackBean destroyCallBackBean = context.getBean("exampleCleanupBean", DestroyCallBackBean.class);
		destroyCallBackBean.display();
	}

	public static void destroyBean() {
		DestroyCallBackBean2 destroyCallBackBean = context.getBean("exampleDestroyBean", DestroyCallBackBean2.class);
		destroyCallBackBean.display();
	}

}
