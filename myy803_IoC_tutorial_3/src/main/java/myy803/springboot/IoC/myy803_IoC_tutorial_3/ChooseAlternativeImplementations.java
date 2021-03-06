package myy803.springboot.IoC.myy803_IoC_tutorial_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import myy803.springboot.IoC.myy803_IoC_tutorial_3.controllers.Controller;

@SpringBootApplication
public class ChooseAlternativeImplementations implements CommandLineRunner {
	
	@Autowired
	@Qualifier("ControllerImplA")
	private Controller controllerA;
	
	@Autowired
	@Qualifier("ControllerImplB")
	private Controller controllerB;
		
	public static void main(String[] args) {
		SpringApplication.run(ChooseAlternativeImplementations.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("******* SpringBoot IoC Tutorial 3 ******* Choose alternative Controller objects");
		
		controllerA.request("Dig a whole");
		controllerB.request("Bury treasure");
	}

}
