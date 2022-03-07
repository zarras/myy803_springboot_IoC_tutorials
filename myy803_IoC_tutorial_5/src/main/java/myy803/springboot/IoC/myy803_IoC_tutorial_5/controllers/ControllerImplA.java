package myy803.springboot.IoC.myy803_IoC_tutorial_5.controllers;

import org.springframework.stereotype.Component;

@Component("ControllerImplA")
public class ControllerImplA implements Controller{
	
	public void request(String requestedOperation) {
		System.out.println("Controller Implemantation A -- Accepted a request to: " + requestedOperation);
	}
}
