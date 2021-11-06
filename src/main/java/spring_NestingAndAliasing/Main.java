package spring_NestingAndAliasing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_NestingAndAliasing.SomeThing.OtherThing;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");

		HelloBean helloBean = (HelloBean) context.getBean("HelloBean");
		helloBean.sayHello();

		// aliasing a bean
		HelloBean helloBeanAlias = (HelloBean) context.getBean("alias_hello_bean");
		helloBeanAlias.sayHello();

		// static nested class (inner class) in bean definition
		callNestedClass();
		
		// bean creation using Non-Static factory method
		DefaultServiceLocator clientService = (DefaultServiceLocator) context.getBean("serviceLocator");
		clientService.createAccountServiceInstance().createInstance();
		clientService.createClientServiceInstance().createInstance();

	}

	public static void callNestedClass() {
		OtherThing otherthing = (OtherThing) context.getBean("otherthing");
		otherthing.sayHello();

	}
}
