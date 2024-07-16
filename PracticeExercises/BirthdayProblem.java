

/** 
* Simulate choosing people at random and checking the day of the year they
* were born on. If the birthday is the same as one that was seen previously,
* stop, and  output number of people who were checked.
*/
public class BirthdayProblem {
	
	public static void main(String[] args)	{

		boolean[] used;	// For recording the possible birthdays
						// that have been seen so far. A value
						// of trun in used[i] means that a person
						// whose birthday is the i-th day of the 
						// year has been found.

		int count;		// The number of people who have been checked.

		used = new boolean[365];	// Initially, all entries are false.

		count = 0;
		 while (true) {
		 		// Select a birthday at random, from 0 to 364.
		 		// If the birthday has already been used, quit.
		 		// Otherwise, record the birthday as used.

		 		int birthday;	// The seleceted birthday.
		 		birthday = (int)(Math.random()*365);
		 		count++;
		 		int threeTimes = 0; 

		 		System.out.printf("Person %d has the same birthday number %d%n", count, birthday);
		 		while (threeTimes <= 3)	{
			 		if ( used[birthday]) {
			 				// This day was found before; it's a diplicate. We are done.
			 			threeTimes++;
			 			System.out.println(threeTimes);
			 			break;
			 		} 
		 		} 
		 		used[birthday] = true;


		 } // End of while loop

		 //System.out.println();
		 //System.out.println("A duplicate birthday was found after" + count + "tries.");
	}
}