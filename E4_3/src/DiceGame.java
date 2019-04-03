import java.util.ArrayList;

public class DiceGame {
	private  ArrayList<Dice> dices;
	
	public DiceGame() {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		this.dices = new ArrayList<Dice>();
		this.dices.add( dice1);
		this.dices.add(dice2);
	}
	
	public int rollDices(int number) {
		if ( number < 2 || number > 12) throw new IllegalArgumentException();
		int cpt = 1; //to count the number of times to roll until getting the number given 
		dices.get(1).rollDice();
		dices.get(0).rollDice();
		while (dices.get(0).getFace() + dices.get(1).getFace() != number) {
			cpt++;
			dices.get(1).rollDice();
			dices.get(0).rollDice();
		}
		
		return cpt;
	}
}
