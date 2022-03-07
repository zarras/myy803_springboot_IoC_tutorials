package myy803.springboot.IoC.myy803_IoC_tutorial_8.commands;

import org.springframework.stereotype.Component;

@Component
public class BuryTreasureCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Executing code for the Bury Treasure command");
	}

}
