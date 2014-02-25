package code;

import java.util.ArrayList;
import java.util.List;

public class Factory {

	private static Factory factory;
	
	
	private List<DisplayALetter> leaves;
	private List<CompositeDisplayALetter> nodes;

	private Factory() {
		leaves = new ArrayList<DisplayALetter>();
		nodes = new ArrayList<CompositeDisplayALetter>();
	}

	public static Factory getInstance() {
		if(factory == null) {
			factory = new Factory();
		}
		return factory;
	}
	
	public void addNode(CompositeDisplayALetter node) {
		this.nodes.add(node);
	}
	
	public void addLeaves(DisplayALetter leaf) {
		this.leaves.add(leaf);
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
	
	
	public void displayInOrderTree() {
		nodes.get(0).add(nodes.get(1));
		nodes.get(0).add(leaves.get(3));
		nodes.get(1).add(nodes.get(2));
		nodes.get(1).add(leaves.get(2));
		nodes.get(2).add(leaves.get(0));
		nodes.get(2).add(leaves.get(1));
		
		nodes.get(0).displayYourLetter();
	}

}
