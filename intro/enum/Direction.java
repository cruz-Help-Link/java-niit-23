
enum Compass {NORTH, SOUTH, WEST, EAST};

public class Direction {
	Compass c = Compass.SOUTH;
	public static void main(String[] args) {
		for (Compass c:Compass.values()) 
			System.out.println(c);
	}
}
