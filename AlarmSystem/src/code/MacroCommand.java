package code;

import java.util.ArrayList;

public class MacroCommand implements Command {
	private ArrayList<Command> commands = new ArrayList<Command>();

	public void add(Command cmd) {
		this.commands.add(cmd); // optional 
	}
	
	public void remove(Command cmd) {
		commands.remove(cmd);
	}

	@Override
	public void execute() {
		for(Command cmd : commands){
			cmd.execute();
		}
	}
}
