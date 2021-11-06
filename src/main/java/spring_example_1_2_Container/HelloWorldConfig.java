package spring_example_1_2_Container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring_NestingAndAliasing.HelloBean;

@Configuration
public class HelloWorldConfig {
	@Bean
	public HelloBean helloWorld() {
		return new HelloBean();
	}
}