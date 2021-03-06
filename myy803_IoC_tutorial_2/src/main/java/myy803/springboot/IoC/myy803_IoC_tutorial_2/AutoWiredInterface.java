package myy803.springboot.IoC.myy803_IoC_tutorial_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import myy803.springboot.IoC.myy803_IoC_tutorial_2.controllers.Controller;

@SpringBootApplication
public class AutoWiredInterface implements CommandLineRunner {
	
	@Autowired
	private Controller controller;
		
	public static void main(String[] args) {
		SpringApplication.run(AutoWiredInterface.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("******* SpringBoot IoC Tutorial 2 ******* Autowire a Controller interface");
		
		controller.request("Dig a whole");
		controller.request("Bury treasure");
	}

}
