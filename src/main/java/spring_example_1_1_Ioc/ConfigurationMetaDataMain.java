package spring_example_1_1_Ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ConfigurationMetaDataMain {

	public static void main(String[] args) {
		appContext();
		beanFactory();

		// bean inheritence
		testBeanInheritence();

	}

	private static void appContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Vehicle obj = (Vehicle) context.getBean("vehicle_car");
		obj.drive();

		ApplicationContext context2 = new FileSystemXmlApplicationContext("/src/main/resources/spring.xml");
		Vehicle obj2 = (Vehicle) context2.getBean("vehicle_car");
		obj2.drive();
	}

	private static void beanFactory() {
		BeanFactory context = new ClassPathXmlApplicationContext("spring.xml");
		Vehicle obj = (Vehicle) context.getBean("vehicle_bike");
		obj.drive();

		BeanFactory context2 = new FileSystemXmlApplicationContext("/src/main/resources/spring.xml");
		Vehicle obj2 = (Vehicle) context2.getBean("vehicle_bike");
		obj2.drive();
	}

	private static void testBeanInheritence() {
		BeanFactory context = new ClassPathXmlApplicationContext("spring.xml");
		// ParentBean obj1 = (ParentBean) context.getBean("inheritedTestBean"); // error
		// System.out.println(obj1.getName());

		ParentBean obj2 = (ChildBean) context.getBean("inheritsWithDifferentClass");
		System.out.println(obj2.getName());

		ChildBean obj3 = (ChildBean) context.getBean("inheritsWithDifferentClass");
		System.out.println(obj3.getName());
	}
}
