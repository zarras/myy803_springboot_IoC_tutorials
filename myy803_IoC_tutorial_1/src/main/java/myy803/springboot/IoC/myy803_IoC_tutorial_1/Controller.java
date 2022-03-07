package myy803.springboot.IoC.myy803_IoC_tutorial_1;

import org.springframework.stereotype.Component;

@Component
public class Controller {
	
	public void request(String requestedOperation) {
		System.out.println("Accepted a request to: " + requestedOperation);
	}
}
