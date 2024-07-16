


public class ThreeBirthdays {
    public static void main(String[] args) {
        
        int numPeople = 0;
        int daysInYear = 365; 
        int differentBirthdays = 0;
        boolean[] birthdaySeen = new boolean[daysInYear];

		while (differentBirthdays < daysInYear) { 
			numPeople++;      
	    	int birthday = (int) (Math.random() * 365);
	       

	        if (!birthdaySeen[birthday]) {
	        	birthdaySeen[birthday] = true;
	        	differentBirthdays++;
	        }
	 
	    }
	    System.out.println("We had to check: " + numPeople + "before we found at least 1 person with a birthday on each day of the year.");
    
    }
}
