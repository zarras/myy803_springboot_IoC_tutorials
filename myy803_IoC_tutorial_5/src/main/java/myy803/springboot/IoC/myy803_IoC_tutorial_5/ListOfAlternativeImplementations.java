package myy803.springboot.IoC.myy803_IoC_tutorial_5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import myy803.springboot.IoC.myy803_IoC_tutorial_5.controllers.Controller;

@SpringBootApplication
public class ListOfAlternativeImplementations implements CommandLineRunner {
	
	@Autowired
	List<Controller> controllers;
		
	public static void main(String[] args) {
		SpringApplication.run(ListOfAlternativeImplementations.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("******* SpringBoot IoC Tutorial 5 ******* Autowire a list of Controller objects");
		
		for(Controller controller : controllers) {		
			controller.request("Dig a whole");
			controller.request("Bury treasure");
		}
	}

}
