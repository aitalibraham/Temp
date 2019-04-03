
public class Main {
	static DiceGame DG = new DiceGame();
	
	public static void main(String[] str){
		try {
			System.out.println(DG.rollDices(15));
		
		}
		catch(IllegalArgumentException e) {
			System.out.println("erreur argument no valide)");
			return;
		}
	}
}
