import java.util.Scanner;

public class GeminiExerciseOne	{

	public static void main(String[] args)   {

		Scanner scanner = new Scanner(System.in);

		int rectWidth;
		int rectHeight;
		int rectArea;

		System.out.println("Enter rectangle width:");
		rectWidth = scanner.nextInt();
		System.out.println("Enter rectangle height:");
		rectHeight = scanner.nextInt();

		rectArea = rectWidth * rectHeight;

		System.out.println("The rectangle area is" + rectArea);

	}
}	