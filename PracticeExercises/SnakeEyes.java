import java.util.Random;

public class SnakeEyes {
	
	public static void main(String[] args)  {
		Random rand = new Random();
		int rolls = 0;
		int die1, die2;

		do {
			die1 = rand.nextInt(6) + 1;
			die2 = rand.nextInt(6) + 1;
			rolls++;



		}	while (die1 != 1 || die2 != 1); 
		
		System.out.println("It took" + rolls + " to get snake eyes");
	}
}