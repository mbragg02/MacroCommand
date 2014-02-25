package code;

public class Factory {

	private static Factory factory;

	private Factory() {
		// Empty private constructor
	}

	public static Factory getInstance() {
		if(factory == null) {
			factory = new Factory();
		}
		return factory;
	}

	public DisplayALetter getDisplayALetterA() {
		return new DisplayTheLetterA();
	}
	public DisplayALetter getDisplayALetterB() {
		return new DisplayTheLetterB();
	}
	public DisplayALetter getDisplayALetterC() {
		return new DisplayTheLetterC();
	}
	public DisplayALetter getDisplayALetterD() {
		return new DisplayTheLetterD();
	}
	public CompositeDisplayALetter getCompositeDisplayALetter() {
		return new CompositeDisplayALetter();
	}

}
