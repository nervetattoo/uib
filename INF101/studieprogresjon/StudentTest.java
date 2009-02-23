package studieprogresjon;

import junit.framework.TestCase;
import studieprogresjon.Student;

public class StudentTest extends TestCase {
    public void testGetSymbol() {
        Position pos = new Position(0,0);
        Student student = new Student(pos);
        assertEquals(student.getSymbol(), 's');
    }
    public void testGetCollidedSymbol() {
        // Make it collided with lecturer
        Position pos = new Position(0,0);
        Student student = new Student(pos);
        student.setCollided(true);
        Lecturer lect = new Lecturer(pos);
        student.setCollidedWith(lect);
        assertEquals('Z', student.getSymbol());
    }

    public void testRunTowards() {
        Position pos = new Position(0,0);
        Position to = new Position(2,2);
        Student student = new Student(pos);
        student.runTowards(to);
        assertTrue(student.getX() == 1 &&
            student.getY() == 1);
    }

    public void testRun() {
        Position pos = new Position(0,0);
        Student student = new Student(pos);
        student.run(Direction.S);
        assertTrue(student.getX() == 0 &&
            student.getY() == 1);
    }
}
