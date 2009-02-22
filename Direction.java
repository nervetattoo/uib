package studieprogresjon;

public enum Direction {
	/**
	 * North west 
	 */
	NW,
	/**
	 * North
	 */
	N,  
	/**
	 * North east
	 */
	NE,
	/**
	 * West
	 */
	W,
	/**
	 * Center
	 */
	C,
	/**
	 * East
	 */
	E,
	/**
	 * South west
	 */
	SW,
	/**
	 * South 
	 */
	S,
	/**
	 * South easet 
	 */
	SE;
	
	/**
     * Convert number to enum type for direction
	 * @param Int between 1-9
	 * @return Direction
	 */
	public static Direction fromNum(int i) {
		switch(i) {
		case 1:
			return Direction.SW;
		case 2:
			return Direction.S;
		case 3:
			return Direction.SE;
		case 4:
			return Direction.W;
		case 5:
			return Direction.C;
		case 6:
			return Direction.E;
		case 7:
			return Direction.NW;
		case 8:
			return Direction.N;
		case 9:
			return Direction.NE;
		}
		return Direction.C;
	}
	
	/**
     * Convert direction for x position
	 * @param d Direction
     * @return Change in x position 
	 */
	public static int dx(Direction d) {
		switch (d) {
		case SW:
		case W:
		case NW:
			return -1;
		case SE:
		case E:
		case NE:
			return 1;
		default:
			return 0;
		}
	}
	
	/**
     * Convert direction for y position
	 * @param d Direction
     * @return Change in y position 
	 */
	public static int dy(Direction d) {
		switch (d) {
		case SW:
		case S:
		case SE:
			return 1;
		case NW:
		case N:
		case NE:
			return -1;
		default:
			return 0;
		}
	}
}
