import java.util.Scanner;

public class SimpleExpressions {
	
	public static void main(String[] args)	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a expression using positive numbers and either +, -, * or /.");
		int firstNum = scanner.nextInt();
		String operatorString = scanner.next();
		char operator = operatorString.charAt(0);
		int secondNum = scanner.nextInt();

		int userAnswer;
		switch (operator)	{
			case '+':
				userAnswer = firstNum + secondNum;
				break;
			case '-':
				userAnswer = firstNum - secondNum;
				break;
			case '*':
				userAnswer = firstNum * secondNum;
				break;
			case '/':
				userAnswer = firstNum / secondNum;
				break;
			default:
				System.out.println("invalid operator");
				return;

		}

		System.out.println(userAnswer);
		
	}
}