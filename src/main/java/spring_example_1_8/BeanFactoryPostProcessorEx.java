package spring_example_1_8;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryPostProcessorEx {
	 public static void main(String args[]) throws Exception {
		    ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		    ctx.getBean("w");
		  }
		}

		class AllBeansLister implements BeanFactoryPostProcessor {

		  public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {

		    System.out.println("The factory contains the followig beans:");
		    String[] beanNames = factory.getBeanDefinitionNames();
		    for (int i = 0; i < beanNames.length; ++i)
		      System.out.println(beanNames[i]);
		  }
}
