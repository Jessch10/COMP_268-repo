import java.util.Scanner;

public class dowhileloop {

	public static void main(String[] args) {
	
	Scanner myscanner = new Scanner(System.in);
	String yourname = "";

	do{
		System.out.print("Enter you name:  ");
		yourname = myscanner.nextLine();
	}while(yourname.isBlank());

	System.out.println("Hello " + yourname);






	}
}