class MyNumber {
    private int n;

    MyNumber() {
        n = 0;
    }

    MyNumber(int n) {
        this.n = n;
    }

    void isNegative() {
        if (n < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is not Negative");
        }
    }

    void isPositive() {
        if (n > 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is not Positive");
        }
    }

    void isOdd() {
        if (n % 2 != 0) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is not Odd");
        }
    }

    void isEven() {
        if (n % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is not Even");
        }
    }

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);

        MyNumber m = new MyNumber(x);

        m.isNegative();
        m.isPositive();
        m.isOdd();
        m.isEven();
    }
}
