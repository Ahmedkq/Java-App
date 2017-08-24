import java.lang.*;

public class ThePoint {

	private int x;
	private int y;

	public ThePoint() {
		x = 0;
		y = 0;
	}

	public ThePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getdistance(ThePoint P) {
		
	       return (Math.sqrt(Math.pow(P.getX() - this.getX(), 2) + Math.pow(P.getY() - this.getY(), 2)));


	}
}
