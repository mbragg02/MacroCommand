package code;

public class CommandFactory {
	
	private static CommandFactory fact;
	
	private CommandFactory() {
		// Private empty constructor
	}
	
	public static CommandFactory getInstance() {
		if(fact == null) {
			fact = new CommandFactory();
		}
		return fact;
	}
	
	public Command getTurnLightsOnCommand(Lights lights) {
		return new TurnLightsOnCommand(lights);
	}
	
	public Command getTurnLightsOffCommand(Lights lights) {
		return new TurnLightsOnCommand(lights);
	}
	
	public Command getTurnSirenOnCommand(Siren siren) {
		return new TurnSirenOnCommand(siren);
	}
	
	public Command getTurnSirenOffCommand(Siren siren) {
		return new TurnSirenOffCommand(siren);
	}
	
	public Command getLockDoorsCommand(Doors doors) {
		return new LockDoorsCommand(doors);
	}
	
	public Command getUnlockDoorsCommand(Doors doors) {
		return new UnlockDoorsCommand(doors);
	}
	
	public Command getReleaseTheHoundsCommand(Hounds hounds) {
		return new ReleaseTheHoundsCommand(hounds);
	}
	
	public Command getCaptureTheHoundsCommand(Hounds hounds) {
		return new CaptureTheHoundsCommand(hounds);
	}
	
	

}
