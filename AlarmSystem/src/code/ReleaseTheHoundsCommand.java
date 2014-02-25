package code;

public class ReleaseTheHoundsCommand implements Command {

	private Hounds hounds;

	public ReleaseTheHoundsCommand(Hounds hounds) {
		this.hounds = hounds;
	}
	
	@Override
	public void execute() {
		hounds.release();
	}

}
