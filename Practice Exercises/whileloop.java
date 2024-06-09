import java.util.Scanner;

public class whileloop {
	
	public static void main(String[] args) {

	// while loop = executes a block of code as long as it's condition remains true


		Scanner scannername = new Scanner(System.in);
		String uname = "";

		while(uname.isBlank()) {
			System.out.print("Enter you name:  ");
			uname = scannername.nextLine();

		}

		System.out.println("Hello" + uname);




	}
}