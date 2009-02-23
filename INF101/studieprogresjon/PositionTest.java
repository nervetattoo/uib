package studieprogresjon;

import studieprogresjon.Position;
import junit.framework.*;

public class PositionTest extends TestCase {
	public void testMoveTowards() {
		Position p1 = new Position(0,0);
		Position p2 = new Position(3,3);
		for(int i = 0; i < 3; i++){
			assertFalse(p1.equals(p2));
			p1.moveTowards(p2);			
		}
        assertTrue(
            p1.getX() == p2.getX() &&
            p1.getY() == p2.getY());
        assertTrue(p1.equals(p2));
	}
}
