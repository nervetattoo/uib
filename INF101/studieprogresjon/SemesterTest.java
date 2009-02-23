package studieprogresjon;

import junit.framework.TestCase;
import studieprogresjon.Semester;

public class SemesterTest extends TestCase {
    public void testNumberOfLecturers() {
        Semester sem = new Semester(
            new Student(new Position(0,0)), 1, 10, 10
        );
        assertEquals(2, sem.numberOfLecturers());
    }

    public void testRegisterLecturer() {
        Semester sem = new Semester(
            new Student(new Position(0,0)), 1, 10, 10
        );
        boolean res = sem.registerLecturer(new Lecturer(new Position(1,3)));
        assertTrue(res);
        assertEquals(1, sem.numberOfRegisteredLecturers());
    }

    public void testRegisterToManyLecturersFail() {
        // Should be room for 1 lecturer in this game
        Semester sem = new Semester(
            new Student(new Position(0,0)), 1, 5,5 
        );
        boolean res = sem.registerLecturer(new Lecturer(new Position(1,3)));
        assertTrue(res);
        boolean res2 = sem.registerLecturer(new Lecturer(new Position(2,3)));
        assertFalse(res2);
        assertEquals(1, sem.numberOfRegisteredLecturers());
    }

    public void testGetMap() {
        Semester sem = new Semester(
            new Student(new Position(0,0)), 1, 5, 5
        );
        sem.registerLecturer(new Lecturer(new Position(2,3)));

        String shouldBe = "-------\n" +
            "|s....|\n" +
            "|.....|\n" +
            "|.....|\n" +
            "|..*..|\n" +
            "|.....|\n" +
            "-------";
        //System.out.println(shouldBe);
        //System.out.println(sem.getMap());
        assertEquals(shouldBe, sem.getMap());
    }
}
