package spring_example_1_8;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor, Ordered {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean '" + beanName + "' created : " + bean.toString());
		return bean;
	}

	public int getOrder() {
		return 1;
	}

}
