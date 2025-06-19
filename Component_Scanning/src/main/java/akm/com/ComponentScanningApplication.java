package akm.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import akm.com.a1.A;

@SpringBootApplication
public class ComponentScanningApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ComponentScanningApplication.class, args);
		A a = (A)context.getBean(A.class);
		System.out.println(a);
		System.out.println(context.getBeanDefinitionCount());
		String[] names = context.getBeanDefinitionNames();
		for(String name: names)
		System.out.println(name);
	}

}
