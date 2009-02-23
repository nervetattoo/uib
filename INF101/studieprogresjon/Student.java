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
    public void runTowards(Position pos) {
        Position p = getPosition();
        p.moveTowards(pos);
        setPosition(p);
    }

    /**
     * Run towards position
     *
     * @param Position pos 
     * @return void
     */
    public void run(Direction d) {
        Position p = getPosition();
        Position to = new Position(
            Direction.dx(d),
            Direction.dy(d));
        p.moveTowards(to);
        setPosition(p);
    }
}
