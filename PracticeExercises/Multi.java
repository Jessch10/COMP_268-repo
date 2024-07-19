public class Multi {
    public static void main(String[] args) {
        int tableSize = 12; 

        // Print the top header row (with extra space for the empty corner)
        System.out.printf("%4s |", ""); 
        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%3d |", i); // Adjust spacing to 3 characters per cell
        }
        System.out.println();

        // Print the rows with the leftmost header column
        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%3d |", i);  // Print the row header with adjusted spacing
            for (int j = 1; j <= tableSize; j++) {
                // Special handling for first row and column duplication
                int result = (i == 1 || j == 1) ? Math.max(i, j) : i * j;
                System.out.printf("%3d |", result); // Print the multiplication result with adjusted spacing
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}