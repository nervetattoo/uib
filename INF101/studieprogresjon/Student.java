package studieprogresjon;

import studieprogresjon.Entity;

public class Student extends Entity {
    public Student(Position pos) {
        super(pos);
    }

    public char getSymbol() {
        return 's';
    }
    
    /**
     * Run towards position
     *
     * @param Position pos 
     * @return void
     */
    public void run(Position pos) {
        Position p = getPosition();
        p.moveTowards(pos);
        setPosition(p);
    }
}
