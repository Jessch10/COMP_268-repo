

public class DivisorExercise {
	
	public static void main(String[] args)	{

		int N;
		int maxDivisors;
		int numWithMax;
		numWithMax = 0;
		maxDivisors = 0;

		for ( N = 100; N <= 1000; N++) {

			int D;
			int divisorCount;

			divisorCount = 0;


			for ( D = 1; D <= N; D++)	{
				if ( N % D == 0 && N % 7 == 0 && N % 3 != 0)
					divisorCount++;
			}	
			
			if (divisorCount > maxDivisors) {
					maxDivisors = divisorCount;
					numWithMax = N;
			}
		}
	System.out.println("The max divisors is" + maxDivisors);
	System.out.println("Which is the number" + numWithMax);
		
	}
}