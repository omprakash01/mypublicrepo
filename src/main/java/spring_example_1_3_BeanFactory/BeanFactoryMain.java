package spring_example_1_3_BeanFactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryMain {
	private static ConfigurableApplicationContext annctx = new ClassPathXmlApplicationContext("spring.xml");

	public static void main(String[] args) {
		// Register BeanDefinition using getBeanFactory / DefaultListableBeanFactory / registerBeanDefinition
		registerBeanDefinition();
		
		// Register SingletonBean
		registerSingletonBean();
	}

	private static void registerBeanDefinition() {
		RootBeanDefinition rbd = new RootBeanDefinition(HelloBean.class);
		DefaultListableBeanFactory bf = (DefaultListableBeanFactory) annctx.getBeanFactory();
		bf.registerBeanDefinition("hello_registered_bean", rbd);

		HelloBean helloBean = (HelloBean) annctx.getBean("hello_registered_bean");
		helloBean.print();
	}
	private static void registerSingletonBean() {
		RootBeanDefinition rbd = new RootBeanDefinition(HelloBean.class);
		DefaultListableBeanFactory bf = (DefaultListableBeanFactory) annctx.getBeanFactory();
		HelloBean bean = bf.createBean(HelloBean.class); 
		bf.registerSingleton("registered_singleton_bean", bean);

		HelloBean helloBean = (HelloBean) annctx.getBean("registered_singleton_bean");
		HelloBean helloBean2 = (HelloBean) annctx.getBean("registered_singleton_bean");
		System.out.println(helloBean.hashCode() == helloBean2.hashCode());
	}
	
}
