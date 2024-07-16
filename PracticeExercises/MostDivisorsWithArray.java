

public class MostDivisorsWithArray {

	public static void main(String[] args) {
		int N;
		int maxDivisors;
		int[] saveCount = new int[10001];

		maxDivisors = 1;
		saveCount[1] = 1;

		for (N = 2; N <= 10000; N++)  {
			int doesDivide;				// a number to be tested to see if it's a divisor of N
			int divisorCount;	// number of divisors of N

			divisorCount = 0;

			for (doesDivide = 1; doesDivide <= N; doesDivide++)	{
				if (N % doesDivide == 0)
					divisorCount++;
			}

			saveCount[N] = divisorCount;	// Record the count for N

			if (divisorCount > maxDivisors)	{
				maxDivisors = divisorCount;
			}
		}

		System.out.println("among integers betweem 1 and 10000,");
		System.out.println("The maximum number of divisors was " + maxDivisors);
		System.out.println("Numbers with that many divisors include:");
		for (N = 1; N <= 10000; N++)	{
			if (saveCount[N] == maxDivisors) {
				System.out.println("   " + N);
			}
		

	}
}
}