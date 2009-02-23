package studieprogresjon;

import junit.framework.TestCase;
import studieprogresjon.EntityMapper;
import studieprogresjon.Student;
import studieprogresjon.Lecturer;

public class EntityMapperTest extends TestCase {
    public void testRegisterEntities() {
        EntityMapper map = new EntityMapper(3);
        // Register student
        map.registerEntity(new Student(new Position(1,1)));
        // Register lecturers
        map.registerEntity(new Lecturer(new Position(1,2)));
        boolean res = map.registerEntity(new Lecturer(new Position(2,2)));
        boolean res2 = map.registerEntity(new Lecturer(new Position(2,2)));
        assertTrue(res);
        assertFalse(res2);
    }

    public void testGetSymbols() {
        EntityMapper map = new EntityMapper(3);
        // Register student
        map.registerEntity(new Student(new Position(1,1)));
        // Register lecturers
        map.registerEntity(new Lecturer(new Position(1,2)));

        assertEquals('s', map.getSymbol(1,1));
        assertEquals('*', map.getSymbol(1,2));

        // Register a collision between lecturers
        map.registerEntity(new Lecturer(new Position(1,2)));

        assertEquals('X', map.getSymbol(1,2));
    }
}
