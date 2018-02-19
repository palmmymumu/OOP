import java.lang.Math;

public class Dice {
	
	private int face;

	public Dice() {
		this.face = 1;
	}

	public void roll() {
		this.face = (int) Math.floor(Math.random() * 6) + 1;
	}

	public int getFace() {
		return this.face;
	}

	@Override
	public String toString() {
		return "Face = " + face;
	}

}