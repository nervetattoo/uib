package studieprogresjon;

import studieprogresjon.Entity;

public class Lecturer extends Entity {
    public Lecturer(Position pos) {
        super(pos);
    }
    public char getSymbol() {
        if (isCollided() == true) {
            String className = getCollidedWith().getClass().getName();
            if (className == "studieprogresjon.Lecturer")
                return 'X';
            else if (className == "studieprogresjon.Student")
                return 'Z';
        }
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
