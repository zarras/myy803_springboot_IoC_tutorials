package myy803.springboot.IoC.myy803_IoC_tutorial_7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PrototypeBeanScopeApp implements CommandLineRunner {
	
	
	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(PrototypeBeanScopeApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("******* SpringBoot IoC Tutorial 6 ******* Singleton beans scope");

		Controller controller1 = context.getBean(Controller.class);
		Controller controller2 = context.getBean(Controller.class);

		controller1.changeState("New State");
		System.out.print("Controller 1 state is: ");
		controller1.printState();
		
		System.out.print("Controller 2 state is: ");
		controller2.printState();
	}

}
