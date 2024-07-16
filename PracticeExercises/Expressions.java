import java.util.Scanner;

public class Expressions {
	
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter and Expression: ");
		//String expression = scanner.nextLine();
        int numOne = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int numTwo = scanner.nextInt();
        int result = 0;

        switch (operator) {
        	case '+':
        		result = numOne + numTwo;
        		break;
        	case '-':
        		result = numOne - numTwo;
        		break;
        	case '*':
        		result = numOne * numTwo;
        		break;
        	case '/':
        		result = numOne / numTwo;
        		break;
        	default:
        		System.out.println("Invalid Operator.");
        }
        


		//System.out.println(N);
		//System.out.println(X);
		//System.out.println(operator);
		System.out.println("The answer to your equation is " + result + ". ");
	}
}