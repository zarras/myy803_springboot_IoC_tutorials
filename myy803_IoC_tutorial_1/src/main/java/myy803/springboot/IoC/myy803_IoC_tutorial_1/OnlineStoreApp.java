package myy803.springboot.IoC.myy803_IoC_tutorial_1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import myy803.springboot.IoC.myy803_IoC_tutorial_1.controller.OnlineStoreController;

@SpringBootApplication
public class OnlineStoreApp implements CommandLineRunner {
	
	
	private OnlineStoreController onlineStoreController;
	
	public OnlineStoreApp(OnlineStoreController controller) {
		super();
		this.onlineStoreController = controller;
	}

	public static void main(String[] args) {
		SpringApplication.run(OnlineStoreApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("******* SpringBoot IoC Tutorial 1 ******* Autowire context object");

		onlineStoreController.acceptIncomingRequest("Deliver Order");
		onlineStoreController.acceptIncomingRequest("Pay Order");
	}

}
