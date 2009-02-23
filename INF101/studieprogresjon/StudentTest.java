package studieprogresjon;

import junit.framework.TestCase;
import studieprogresjon.Student;

public class StudentTest extends TestCase {
    public void testGetSymbol() {
        Position pos = new Position(0,0);
        Student student = new Student(pos);
        assertTrue(student.getSymbol() == 's');
    }

    public void testRun() {
        Position pos = new Position(0,0);
        Position to = new Position(2,2);
        Student student = new Student(pos);
        student.run(to);
        assertTrue(student.getX() == 1 &&
            student.getY() == 1);
    }
}
