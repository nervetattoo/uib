package studieprogresjon;

import junit.framework.TestCase;
import studieprogresjon.EntityMock;

public class EntityTest extends TestCase {
    public void testCreateAndGetPosition() {
        Position pos = new Position(0,0);
        Entity mock = new EntityMock(pos);
        assertEquals(pos, mock.getPosition());
    }

    public void testGetXAndY() {
        int x = 2;
        int y = 3;
        Position pos = new Position(x,y);
        Entity mock = new EntityMock(pos);
        assertTrue(mock.getX() == x);
        assertTrue(mock.getY() == y);
    }

    public void testIsCollided() {
        Position pos = new Position(1,0);
        Entity mock = new EntityMock(pos);
        assertFalse(mock.isCollided());
    }

    public void testCheckCollision() {
        Entity mock1 = new EntityMock(new Position(0,0));
        Entity mock2 = new EntityMock(new Position(3,3));
        Entity mock3 = new EntityMock(new Position(1,6));
        Entity[] colliders = {mock2,mock3};
        Position pos;
        for (int x = 0; x < 3; x++) {
            assertFalse(mock1.checkCollision(colliders));
            pos = mock1.getPosition();
            colliders[0].getPosition().moveTowards(pos);
            colliders[1].getPosition().moveTowards(pos);
        }
        assertTrue(mock1.checkCollision(colliders));
    }
}
