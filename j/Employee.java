import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] e = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee details:");

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            e[i] = new Employee(id, name, salary);
        }

        int max = 0;

        for (int i = 1; i < n; i++) {
            if (e[i].salary > e[max].salary) {
                max = i;
            }
        }

        System.out.println("\nEmployee having maximum salary:");
        System.out.println("Name = " + e[max].name);
        System.out.println("Salary = " + e[max].salary);
    }
}
