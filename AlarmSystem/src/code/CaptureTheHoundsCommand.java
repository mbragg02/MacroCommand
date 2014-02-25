package code;

public class CaptureTheHoundsCommand implements Command {

	private Hounds hounds;

	public CaptureTheHoundsCommand(Hounds hounds) {
		this.hounds = hounds;
	}
	
	@Override
	public void execute() {
		this.hounds.capture();

	}

}
