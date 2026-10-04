import java.util.Scanner;

class Vehicle {
    String company;
    double price;

    Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }
}

class LightMotorVehicle extends Vehicle {
    double mileage;

    LightMotorVehicle(
        String company,
        double price,
        double mileage
    ) {
        super(company, price);
        this.mileage = mileage;
    }

    void display() {
        System.out.println("Type = Light Motor Vehicle");
        System.out.println("Company = " + company);
        System.out.println("Price = " + price);
        System.out.println("Mileage = " + mileage);
    }
}

class HeavyMotorVehicle extends Vehicle {
    double capacity_in_tons;

    HeavyMotorVehicle(
        String company,
        double price,
        double capacity
    ) {
        super(company, price);
        capacity_in_tons = capacity;
    }

    void display() {
        System.out.println("Type = Heavy Motor Vehicle");
        System.out.println("Company = " + company);
        System.out.println("Price = " + price);
        System.out.println(
            "Capacity = " + capacity_in_tons + " tons"
        );
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\n1. Light Motor Vehicle");
            System.out.println("2. Heavy Motor Vehicle");

            System.out.print("Enter vehicle type: ");
            int type = sc.nextInt();

            System.out.print("Enter company: ");
            String company = sc.next();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            if (type == 1) {
                System.out.print("Enter mileage: ");
                double mileage = sc.nextDouble();

                LightMotorVehicle l =
                    new LightMotorVehicle(
                        company,
                        price,
                        mileage
                    );

                l.display();

            } else if (type == 2) {
                System.out.print("Enter capacity in tons: ");
                double capacity = sc.nextDouble();

                HeavyMotorVehicle h =
                    new HeavyMotorVehicle(
                        company,
                        price,
                        capacity
                    );

                h.display();
            } else {
                System.out.println("Invalid vehicle type.");
            }
        }
    }
}
