import java.util.Scanner;

class Clock {
    int hours;
    int minutes;
    int seconds;

    Clock(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    boolean isValid() {
        return hours >= 0 && hours <= 23
            && minutes >= 0 && minutes <= 59
            && seconds >= 0 && seconds <= 59;
    }

    void display() {
        int h = hours;
        String mode;

        if (h >= 12) {
            mode = "PM";
        } else {
            mode = "AM";
        }

        if (h == 0) {
            h = 12;
        } else if (h > 12) {
            h = h - 12;
        }

        System.out.printf(
            "%02d:%02d:%02d %s",
            h,
            minutes,
            seconds,
            mode
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int h = sc.nextInt();

        System.out.print("Enter minutes: ");
        int m = sc.nextInt();

        System.out.print("Enter seconds: ");
        int s = sc.nextInt();

        Clock c = new Clock(h, m, s);

        if (c.isValid()) {
            c.display();
        } else {
            System.out.println("Invalid Time");
        }
    }
}
