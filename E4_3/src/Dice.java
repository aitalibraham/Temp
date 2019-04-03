import java.util.Random;

public class Dice implements DiceFunctions {
	private int face;

	@Override
	public void rollDice() {
		// return a random number in the permitted range
		Random rand = new Random();
		this.face = rand.nextInt(DiceFunctions.maxfacesPossibles);
	}
	
	public int getFace() {
		return this.face;
	}
	
}
