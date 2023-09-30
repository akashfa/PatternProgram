public class PrimeNumber {
    static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // prime number
        for (int i = 2; i <= 20; i++) {
            if (prime(i)) {
                System.out.println(i);
            }
        }
    }
}