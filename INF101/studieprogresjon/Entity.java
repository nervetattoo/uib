package studieprogresjon;

import studieprogresjon.Position;

/**
 * Abstract Entity class.
 * Common stuff for game entities
 * 
 * @package studieprogresjon 
 * @author Raymond Julin
 */
public abstract class Entity {
    Position pos;
    boolean collided = false;

    public Entity(Position p) {
        this.pos = p;
    }

    public void setPosition(Position p) {
        this.pos = p;
    }

    public Position getPosition() {
        return this.pos;
    }
    public int getX() {
        return pos.getX();
    }
    public int getY() {
        return pos.getY();
    }

    public boolean isCollided() {
        return this.collided;
    }
    public void setCollided() {
        this.collided = true;
    }
    public boolean checkCollision(Entity[] entities) {
        for (Entity e: entities) {
            if (this.getPosition().equals(e.getPosition())) {
                return true;
            }
        }
        return false;
    }
}
