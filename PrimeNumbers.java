public class PrimeNumbers {
    public static void main(String[] args) {
        int maxNum = 100000;

        System.out.println("Prime numbers up to " + maxNum + ":");

        for (int num = 2; num <= maxNum; num++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}