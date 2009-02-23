package studieprogresjon;

import studieprogresjon.Direction;
import junit.framework.*;

public class DirectionTest extends TestCase {
	public void testFromInt() {
        Direction d1 = Direction.fromNum(5);
        assertTrue(d1 == Direction.C);
	}

	public void testMovement() {
        // X
        assertTrue(Direction.dx(Direction.W) == -1);
        assertTrue(Direction.dx(Direction.E) == 1);
        assertTrue(Direction.dx(Direction.N) == 0);
        // Y
        assertTrue(Direction.dy(Direction.N) == -1);
        assertTrue(Direction.dy(Direction.S) == 1);
        assertTrue(Direction.dy(Direction.E) == 0);
	}
}
