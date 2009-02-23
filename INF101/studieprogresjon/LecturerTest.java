package studieprogresjon;

import junit.framework.TestCase;
import studieprogresjon.Lecturer;

public class LecturerTest extends TestCase {
    public void testGetSymbol() {
        Position pos = new Position(0,0);
        Lecturer lect = new Lecturer(pos);
        assertTrue(lect.getSymbol() == '*');
    }

    public void testChase() {
        Position pos = new Position(0,0);
        Position to = new Position(2,2);
        Lecturer lect = new Lecturer(pos);
        lect.chase(to);
        assertTrue(lect.getX() == 1 &&
            lect.getY() == 1);
    }
}
