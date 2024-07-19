import java.util.Scanner;

public class HelpMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menuSelect; 

        while (true) { // Keep looping until the user exits
            System.out.println("\nJava Help Menu");
            System.out.println("Select Help on:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while");
            System.out.println("x. Exit");
            
            System.out.print("Selection: "); // Get the user's choice
            menuSelect = scanner.nextLine();
            System.out.println("");

            switch (menuSelect) {
                case "1":
                    System.out.println("Help on 'if' statement:\nThe 'if' statement allows you to control the flow of your program based on whether a certain condition is true or false.");
                    break;
                case "2":
                    System.out.println("Help on 'switch' statement:\nThe 'switch' statement selects one of many code blocks to be executed.");
                    break;
                case "3":
                    System.out.println("Help on 'for' loop:\nThe 'for' loop is a powerful iterative construct in Java designed to repeat a block of code a specific number of times or as long as a condition holds true.");
                    break;
                case "4":
                    System.out.println("Help on 'while' loop:\nThe 'while' loop is another iterative construct in Java that repeatedly executes a block of code as long as a given condition remains true.");
                    break;
                case "5":
                    System.out.println("Help on 'do-while' loop:\nThe 'do-while' loop is another iterative construct in Java that repeats a block of code until a specific condition becomes false.");
                    break;
                case "x":
                    System.out.println("Thank you. Goodbye.");
                    System.exit(0); // Exit the loop
                default:
                    System.out.println("Invalid entry, please try again.");
            }
        }
        
        
    }
}