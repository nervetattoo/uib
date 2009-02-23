package studieprogresjon;

import studieprogresjon.Student;
import studieprogresjon.Lecturer;

/**
 * Helper class to map entities to map coordinates
 *
 * @author Raymond Julin
 */
class EntityMapper {
    private Entity[] entities;
    private int size = 0;

    
    /**
     * Constructor
     *
     * @param int size Max entities to register
     */
    public EntityMapper(int size) {
        this.size = size;
        entities = new Entity[size];
    }
    
    /**
     * Register entity
     *
     * @return boolean success
     * @param Entity entity
     */
    public boolean registerEntity(Entity entity) {
        int used = this.slotsUsed();
        if ((this.size - used) > 0) {
            entities[used] = entity;
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Return symbol for given coordinates
     *
     * @return char
     * @param int x
     * @param int y
     */
    public char getSymbol(int x, int y) {
        Position pos = new Position(x,y);
        for (Entity e: entities) {
            // Need to be at this position
            if (e instanceof studieprogresjon.Entity) {
                if (e.getPosition().equals(pos)) {
                    e.checkCollision(entities);
                    return e.getSymbol();
                }
            }
        }
        return '.';
    }
    
    /**
     * Calculate number of free slots
     *
     * @return int
     */
        private int slotsUsed() {
        int i = 0;
        for (Entity e: entities) {
            if (e instanceof Entity)
                i++;
        }
        return i;
    }
}
