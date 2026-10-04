class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

class Driver {
    int license_no;
    String name;
    String address;
    int age;

    Driver(
        int license_no,
        String name,
        String address,
        int age
    ) throws AgeException {

        if (age < 18) {
            throw new AgeException("Age is below 18 years");
        }

        this.license_no = license_no;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    void display() {
        System.out.println("License No = " + license_no);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
        System.out.println("Age = " + age);
    }

    public static void main(String[] args) {
        try {
            Driver d = new Driver(
                101,
                "Amit",
                "Pune",
                20
            );

            d.display();
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
