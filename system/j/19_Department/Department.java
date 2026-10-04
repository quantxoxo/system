class College {
    int cno;
    String cname;
    String caddr;

    College(int cno, String cname, String caddr) {
        this.cno = cno;
        this.cname = cname;
        this.caddr = caddr;
    }

    void displayCollege() {
        System.out.println("College No = " + cno);
        System.out.println("College Name = " + cname);
        System.out.println("College Address = " + caddr);
    }
}

class Department extends College {
    int dno;
    String dname;

    Department(
        int cno,
        String cname,
        String caddr,
        int dno,
        String dname
    ) {
        super(cno, cname, caddr);

        this.dno = dno;
        this.dname = dname;
    }

    void display() {
        displayCollege();

        System.out.println("Department No = " + dno);
        System.out.println("Department Name = " + dname);
    }

    public static void main(String[] args) {

        Department d = new Department(
            1,
            "ABC College",
            "Pune",
            101,
            "Computer Science"
        );

        d.display();
    }
}
