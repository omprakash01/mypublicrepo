package spring_example_1_8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Boot {
	public static void main(final String[] args) throws Exception {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Messenger messenger = ctx.getBean("message", Messenger.class);
        
        messenger.getMessage();
        ctx.registerShutdownHook();

    }
}
