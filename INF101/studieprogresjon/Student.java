package studieprogresjon;

import studieprogresjon.Entity;

public class Student extends Entity {
    public Student(Position pos) {
        super(pos);
    }
    public Student() {
        super(new Position(0,0));
    }

    public char getSymbol() {
        if (isCollided() == true) {
            if (getCollidedWith().getClass().getName() == "studieprogresjon.Lecturer")
                return 'Z';
        }
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
