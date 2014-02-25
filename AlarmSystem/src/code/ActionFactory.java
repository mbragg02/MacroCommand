package code;

public class ActionFactory {
	
private static ActionFactory fact;
	
	private ActionFactory() {
		// Private empty constructor
	}
	
	public static ActionFactory getInstance() {
		if(fact == null) {
			fact = new ActionFactory();
		}
		return fact;
	}
	
	public Lights getLights() {
		return new Lights();
	}
	public Doors getDoors() {
		return new Doors();
	}
	public Siren getSiren() {
		return new Siren();
	}
	public Hounds getHounds() {
		return new Hounds();
	}

}
