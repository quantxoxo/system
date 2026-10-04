import java.util.Scanner;

class ZeroException extends Exception {

    ZeroException(String message) {
        super(message);
    }
}

class Prime {

    static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        try {

            if (n == 0) {
                throw new ZeroException("Number is 0");
            }

            if (isPrime(n)) {
                System.out.println("Number is Prime");
            } else {
                System.out.println("Number is not Prime");
            }

        } catch (ZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
