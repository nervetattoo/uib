package studieprogresjon;

import junit.framework.TestCase;
import studieprogresjon.Lecturer;
import studieprogresjon.Student;

public class LecturerTest extends TestCase {
    public void testGetSymbol() {
        Position pos = new Position(0,0);
        Lecturer lect = new Lecturer(pos);
        assertTrue(lect.getSymbol() == '*');
    }

    public void testGetCollidedWithLecturer() {
        // Make it collided with lecturer
        Position pos = new Position(0,0);
        Lecturer lect = new Lecturer(pos);
        lect.setCollided(true);
        Lecturer lect2 = new Lecturer(pos);
        lect.setCollidedWith(lect);
        assertEquals('X', lect.getSymbol());
    }

    public void testGetCollidedWithStudent() {
        // Make it collided with lecturer
        Position pos = new Position(0,0);
        Lecturer lect = new Lecturer(pos);
        lect.setCollided(true);

        Student student = new Student(pos);
        lect.setCollidedWith(student);
        assertEquals('Z', lect.getSymbol());
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
