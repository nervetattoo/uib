package studieprogresjon;

import studieprogresjon.Entity;

public class Lecturer extends Entity {
    public Lecturer(Position pos) {
        super(pos);
    }
    public char getSymbol() {
        return '*';
    }

    /**
     * Chase towards position
     *
     * @param Position pos 
     * @return void
     */
    public void chase(Position pos) {
        Position p = getPosition();
        p.moveTowards(pos);
        setPosition(p);
    }
}
