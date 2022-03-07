package myy803.springboot.IoC.myy803_IoC_tutorial_8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import myy803.springboot.IoC.myy803_IoC_tutorial_8.controllers.Controller;

@SpringBootApplication
public class AutoWiredComposite implements CommandLineRunner {
	
	private static int BURY_TREASURE = 0;
	private static int DIG_A_HOLE = 1;

	@Autowired
	private Controller controller;
		
	public static void main(String[] args) {
		SpringApplication.run(AutoWiredComposite.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("******* SpringBoot IoC Tutorial 8 ******* Autowire a composite Controller");
		
		controller.request(DIG_A_HOLE);
		controller.request(BURY_TREASURE);
	}

}
