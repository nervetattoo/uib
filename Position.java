package studieprogresjon;

/**
 * Class to help with entity positioning
 * @author Raymond Julin
 */
public class Position {
    public int x,y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Check if input position is same as this one
     * @param Position p
     */
    public boolean equals(Position p) {
        if (p.getX() == this.x && p.getY() == this.y)
            return true;
        else
            return false;
    }

    /**
     * Return X value
     */
    public int getX() {
        return x;
    }
    
    /**
     * Return Y value
     */
    public int getY() {
        return y;
    }
    
    /**
     * Attempt to move this position closer to input location
     *
     * @param Position p
     */
    public void moveTowards(Position p) {
        // X movement
        if (p.getX() > x) 
            x++;
        else if (p.getX() < x)
            x--;
        // Y movement
        if (p.getY() > y)
            y++;
        else if (p.getY() < y)
            y--;
    }
}
