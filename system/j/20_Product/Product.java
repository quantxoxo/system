interface ProductInfo {
    void display();
}

class Product implements ProductInfo {

    int product_id;
    String product_name;
    double product_cost;
    int product_quantity;

    static int count = 0;

    Product() {
        product_id = 0;
        product_name = "Unknown";
        product_cost = 0;
        product_quantity = 0;

        count++;
    }

    Product(
        int id,
        String name,
        double cost,
        int quantity
    ) {
        product_id = id;
        product_name = name;
        product_cost = cost;
        product_quantity = quantity;

        count++;
    }

    public void display() {
        System.out.println("Product ID = " + product_id);
        System.out.println("Product Name = " + product_name);
        System.out.println("Product Cost = " + product_cost);
        System.out.println(
            "Product Quantity = " + product_quantity
        );
        System.out.println();
    }

    public static void main(String[] args) {

        Product p1 = new Product();

        Product p2 = new Product(
            101,
            "Pen",
            20,
            5
        );

        Product p3 = new Product(
            102,
            "Book",
            100,
            10
        );

        p1.display();
        p2.display();
        p3.display();

        System.out.println("Number of objects = " + count);
    }
}
