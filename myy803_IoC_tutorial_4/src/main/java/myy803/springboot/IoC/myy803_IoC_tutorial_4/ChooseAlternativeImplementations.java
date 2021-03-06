package myy803.springboot.IoC.myy803_IoC_tutorial_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import myy803.springboot.IoC.myy803_IoC_tutorial_4.controllers.Controller;

@SpringBootApplication
public class ChooseAlternativeImplementations implements CommandLineRunner {
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	@Value("${controller.implementation}")
	private String controllerType;
		
	public static void main(String[] args) {
		SpringApplication.run(ChooseAlternativeImplementations.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("******* SpringBoot IoC Tutorial 4 ******* Choose alternative Controller objects");
		
		Controller controller =  (Controller) context.getBean(controllerType);
		
		controller.request("Dig a whole");
		controller.request("Bury treasure");
	}

}
