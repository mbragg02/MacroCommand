package tests;

import org.junit.Test;

import code.CompositeDisplayALetter;
import code.DisplayALetter;
import code.Factory;

/**
 * 
 * @author Michael Bragg
 *
 */
public class LargerTreeStructureTest {


	@Test
	public void test() {
		Factory fact = Factory .getInstance();
		fact.addLeaves(fact.getDisplayALetterA());
		fact.addLeaves(fact.getDisplayALetterB());
		fact.addLeaves(fact.getDisplayALetterC());
		fact.addLeaves(fact.getDisplayALetterD());
		
		fact.addNode(fact.getCompositeDisplayALetter());
		fact.addNode(fact.getCompositeDisplayALetter());
		fact.addNode(fact.getCompositeDisplayALetter());
		
//		DisplayALetter a = fact.getDisplayALetterA();
//		DisplayALetter b = fact.getDisplayALetterB();
//		DisplayALetter c = fact.getDisplayALetterC();
//		DisplayALetter d = fact.getDisplayALetterD();
		
//		CompositeDisplayALetter top     = fact.getCompositeDisplayALetter();
//		CompositeDisplayALetter middle1 = fact.getCompositeDisplayALetter();
//		CompositeDisplayALetter middle2 = fact.getCompositeDisplayALetter();
		
//		top.add(middle1);
//		top.add(d);
//		
//		middle1.add(middle2);
//		middle1.add(c);
//		middle2.add(a);
//		middle2.add(b);
//		
//		top.displayYourLetter();
		
		fact.displayInOrderTree();
		
	}

}
