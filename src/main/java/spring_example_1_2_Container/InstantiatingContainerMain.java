package spring_example_1_2_Container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import spring_NestingAndAliasing.HelloBean;

public class InstantiatingContainerMain {
	@Autowired
	private JpaAccountDao dao;

	public static void main(String[] args) {
		appContext();
		genericAppContext();

		// using Anotations
		helloWorldUsingAnnotation();

		// depends-on
		dependsOn();
	}

	private static void appContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
		PetStoreServiceImpl service = (PetStoreServiceImpl) context.getBean("petStore");
		System.out.println(service.getAccountDao().getAmount() + " ---- " + service.getItemDao().getName());

		// inner bean
		ApplicationContext context2 = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
		PetStoreServiceImpl service2 = (PetStoreServiceImpl) context2.getBean("petStore2");
		System.out.println(service2.getAccountDao().getAmount() + " ---- " + service2.getItemDao().getName());

	}

	private static void genericAppContext() {
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("services.xml", "daos.xml");
		context.refresh();
		PetStoreServiceImpl service = (PetStoreServiceImpl) context.getBean("petStore");
		System.out.println("Using Generic App Context " + service.getAccountDao().getAmount() + " ---- "
				+ service.getItemDao().getName());
	}

	private static void helloWorldUsingAnnotation() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloBean helloWorld = ctx.getBean(HelloBean.class);
		helloWorld.setName("Hello World using Annotation!");
		helloWorld.sayHello();
	}

	private static void dependsOn() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("daos.xml");
		JpaAccountDao helloWorld = ctx.getBean("beanOne", JpaAccountDao.class);
		helloWorld.print();
//		helloWorld.sayHello();
	}

}
