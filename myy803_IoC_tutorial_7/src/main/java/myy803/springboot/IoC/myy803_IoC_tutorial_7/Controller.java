package myy803.springboot.IoC.myy803_IoC_tutorial_7;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Controller {
	private String state = "Old State";
	
	public void changeState(String newState) {
		System.out.println("Accepted a request to change state");
		state = newState;
	}
	
	public void printState() {
		System.out.println(state);
	}
	
}
