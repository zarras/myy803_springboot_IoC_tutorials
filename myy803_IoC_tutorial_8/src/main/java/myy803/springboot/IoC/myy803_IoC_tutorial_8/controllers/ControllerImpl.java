package myy803.springboot.IoC.myy803_IoC_tutorial_8.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import myy803.springboot.IoC.myy803_IoC_tutorial_8.commands.Command;

@Component
public class ControllerImpl implements Controller{
	
	@Autowired
	private List<Command> commands; 
	
	@Override
	public void request(int commandID) {
		Command command = commands.get(commandID);
		command.execute();
	}
}
