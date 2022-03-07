package myy803.springboot.IoC.myy803_IoC_tutorial_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutoWiredContextApp implements CommandLineRunner {
	
	
	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(AutoWiredContextApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("******* SpringBoot IoC Tutorial 1 ******* Autowire context object");

		 Controller controller = context.getBean(Controller.class);
		 controller.request("Dig a whole");
		 controller.request("Bury treasure");
		
	}

}
