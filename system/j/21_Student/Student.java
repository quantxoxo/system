class AttendanceException extends Exception {

    AttendanceException(String message) {
        super(message);
    }
}

class Student {
    String student_name;
    int student_rollno;
    int total_lectures;
    int attended_lectures;

    Student(
        String name,
        int roll,
        int total,
        int attended
    ) {
        student_name = name;
        student_rollno = roll;
        total_lectures = total;
        attended_lectures = attended;
    }

    void checkAttendance()
        throws AttendanceException {

        double percentage =
            (attended_lectures * 100.0) / total_lectures;

        if (percentage < 75) {
            throw new AttendanceException(
                "Student is Not Eligible for Exam"
            );
        }

        System.out.println(
            "Student Name = " + student_name
        );

        System.out.println(
            "Roll No = " + student_rollno
        );

        System.out.println(
            "Attendance = " + percentage + "%"
        );
    }

    public static void main(String[] args) {

        Student s = new Student(
            "Rahul",
            10,
            100,
            80
        );

        try {
            s.checkAttendance();
        } catch (AttendanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
