package myy803.springboot.IoC.myy803_IoC_tutorial_0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutoWiredPropertyApp implements CommandLineRunner {
	
	@Autowired
	private Controller controller;
		
	public static void main(String[] args) {
		SpringApplication.run(AutoWiredPropertyApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("******* SpringBoot IoC Tutorial 0 ******* Autowire a Controller object");
		
		controller.request("Dig a whole");
		controller.request("Bury treasure");
	}
}
