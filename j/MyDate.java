import java.util.Scanner;

class InvalidDateException extends Exception {

    InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    int day;
    int month;
    int year;

    void accept(
        int d,
        int m,
        int y
    ) throws InvalidDateException {

        if (m < 1 || m > 12) {
            throw new InvalidDateException(
                "InvalidDateException"
            );
        }

        if (d < 1 || d > 31) {
            throw new InvalidDateException(
                "InvalidDateException"
            );
        }

        if ((m == 4 || m == 6 ||
             m == 9 || m == 11) && d > 30) {

            throw new InvalidDateException(
                "InvalidDateException"
            );
        }

        if (m == 2 && d > 29) {
            throw new InvalidDateException(
                "InvalidDateException"
            );
        }

        day = d;
        month = m;
        year = y;
    }

    void display() {
        System.out.println(
            "Date = " + day + "/" + month + "/" + year
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int d = sc.nextInt();

        System.out.print("Enter month: ");
        int m = sc.nextInt();

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        MyDate date = new MyDate();

        try {
            date.accept(d, m, y);
            date.display();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}
