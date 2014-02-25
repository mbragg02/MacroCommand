package tests;

import org.junit.Test;

import code.CompositeDisplayALetter;
import code.DisplayALetter;
import code.DisplayTheLetterA;
import code.DisplayTheLetterB;
import code.DisplayTheLetterC;
import code.DisplayTheLetterD;

/**
 * 
 * @author Michael Bragg
 *
 */
public class LargerTreeStructureTest {


	@Test
	public void test() {
		DisplayALetter a = new DisplayTheLetterA();
		DisplayALetter b = new DisplayTheLetterB();
		DisplayALetter c = new DisplayTheLetterC();
		DisplayALetter d = new DisplayTheLetterD();
		
		CompositeDisplayALetter top = new CompositeDisplayALetter();
		CompositeDisplayALetter middle1 = new CompositeDisplayALetter();
		CompositeDisplayALetter middle2 = new CompositeDisplayALetter();
		
		top.add(middle1);
		top.add(d);
		middle1.add(middle2);
		middle1.add(c);
		middle2.add(a);
		middle2.add(b);
		
		top.displayYourLetter();
		
	}

}
