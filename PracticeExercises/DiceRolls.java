

public class DiceRolls {
	
	public static void main(String[] args)  {
		int diceOne = 0;
		int diceTwo = 0;
		int numOfRolls = 0;

		while ( diceOne != 1 && diceTwo != 1 )	{
			numOfRolls++;
			diceOne = (int) (Math.random() * 6) + 1;
			diceTwo = (int) (Math.random() * 6) + 1;
		}
		System.out.println("We rolled snake eyes after " + numOfRolls + "rolls.");
	}
}