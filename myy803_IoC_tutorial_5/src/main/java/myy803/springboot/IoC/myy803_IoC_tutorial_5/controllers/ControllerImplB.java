package myy803.springboot.IoC.myy803_IoC_tutorial_5.controllers;

import org.springframework.stereotype.Component;

@Component("ControllerImplB")
public class ControllerImplB implements Controller{
	
	public void request(String requestedOperation) {
		System.out.println("Controller Implemantation B -- Accepted a request to: " + requestedOperation);
	}
}
