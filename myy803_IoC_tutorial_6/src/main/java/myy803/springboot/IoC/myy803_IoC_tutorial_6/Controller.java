package myy803.springboot.IoC.myy803_IoC_tutorial_6;

import org.springframework.stereotype.Component;

@Component
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
