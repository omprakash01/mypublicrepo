package spring_example_1_5_Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_NestingAndAliasing.HelloBean;

public class ScopeMain {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("scope.xml");

		// scope singleton
		ScopeBean scopeBean = (ScopeBean) context.getBean("scope_bean");
		scopeBean.printMsg();
		ScopeBean scopeBean2 = (ScopeBean) context.getBean("scope_bean");
		System.out.println(scopeBean.hashCode() == scopeBean2.hashCode());

		// Custom Scope
		
	}

}
