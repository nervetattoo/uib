package studieprogresjon;

import studieprogresjon.Student;
import studieprogresjon.Lecturer;
import studieprogresjon.EntityMapper;

/**
 * Main class for game.
 * 
 * @author Raymond Julin
 */
public class Semester {
    private int level,width,height;
    private EntityMapper mapper;

    public Semester(Student student, int level, int width, int height) {
        this.level = level;
        this.width = width;
        this.height = height;
        this.mapper = new EntityMapper(numberOfLecturers() + 1);
        this.mapper.registerEntity(student);
        // Register lecturers
        /*
        for (int x = 0; x <= numberOfLecturers(); x++) {
            this.mapper.registerEntity(new Lecturer(new Position(x,x)));
        }
        */
    }
    
    /**
     * Decide number of lecturers to use for game level
     *
     * @return int
     */
    public int numberOfLecturers() {
        return (this.width * this.level) / 5;
    }

    /**
     * Get array over all lecturers
     *
     * @return Lecturers[]
     */
    public Lecturer[] getLecturers() {
        return this.mapper.getLecturers();
    }

    /**
     * Register a new lecturer onto game
     *
     * @return void
     * @param Lecturer lect
     */
    public boolean registerLecturer(Lecturer lect) {
        return this.mapper.registerEntity(lect);
    }

    /**
     * Calculate number of registered lecturers in game
     *
     * @return int
     */
    public int numberOfRegisteredLecturers() {
        int i = 0;
        for (Lecturer l: this.mapper.getLecturers()) {
            if (l instanceof Lecturer)
                i++;
        }
        return i;
    }
    
    /**
     * Create game map as a string and return it
     *
     * @return String
     */
    public String getMap() {
        String row = "";
        String map = "";
        char symb = 'a';
        for (int i = 0; i < (this.width + 2); i++) {
            map += "-";
        }
        map += "\n";
        for (int y = 0; y < this.height; y++) {
            // Rows
            row = "|";
            for (int x = 0; x < this.width; x++) {
                // TODO Check what should be placed here
                symb = this.mapper.getSymbol(x,y);
                row += symb;
            }
            row += "|";
            map += row + "\n";
        }
        for (int i = 0; i < (this.width + 2); i++) {
            map += "-";
        }
        return map;
    }
}
