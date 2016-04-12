package sample.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(Main.class.getClassLoader().getResource(".").getPath());
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
	}
}
